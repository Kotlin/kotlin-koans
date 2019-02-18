package iii_conventions

import iii_conventions.test.s
import org.junit.Assert.assertTrue
import org.junit.Test

class N25ComparisonKtTest {
    /* Month numbering starts with 0 (0-Jan, 1-Feb, ... 11-Dec) */
    @Test fun testDateComparison() {
        assertTrue(task25(MyDate(2014, 1, 1), MyDate(2014, 1, 2)))
    }

    @Test
    fun first_date_should_be_equal_second_date() {
        val first = MyDate(2014, 5, 10)
        val second = MyDate(2014, 5, 10)
        assertTrue("The date ${first.s} should be equal ${second.s}", first == second)
    }

    @Test
    fun first_date_should_be_before_second_date() {
        MyDate(2014, 12, 31).assertBefore(2015, 1, 1)
        MyDate(2014, 4, 31).assertBefore(2014, 5, 1)
        MyDate(2014, 4, 10).assertBefore(2014, 4, 11)
    }

    @Test
    fun first_date_should_be_after_second_date() {
        MyDate(2015, 1, 1).assertAfter(2014, 12, 31)
        MyDate(2015, 5, 1).assertAfter(2015, 4, 31)
        MyDate(2015, 5, 10).assertAfter(2015, 5, 9)
    }

    /* If you declare 'compareTo' as an extension function, remove this one to make the code compile */
    operator fun MyDate.compareTo(other: MyDate): Int = todoTask25()

    private fun MyDate.assertAfter(year: Int, month: Int, dayOfMonth: Int) {
        val myDate = MyDate(year, month, dayOfMonth)
        assertTrue("The date $s should be after ${myDate.s}", this > myDate)
    }

    private fun MyDate.assertBefore(year: Int, month: Int, dayOfMonth: Int) {
        val myDate = MyDate(year, month, dayOfMonth)
        assertTrue("The date $s should be before ${myDate.s}", this < myDate)
    }
}