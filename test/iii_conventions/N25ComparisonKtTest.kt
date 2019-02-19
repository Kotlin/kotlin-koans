package iii_conventions

import iii_conventions.test.s
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class N25ComparisonKtTest {
    /* Month numbering starts with 0 (0-Jan, 1-Feb, ... 11-Dec) */
    @Test
    fun testDateComparison() {
        assertTrue(task25(MyDate(2014, 1, 1), MyDate(2014, 1, 2)))
    }

    @Test
    fun testBefore() {
        val first = MyDate(2014, 5, 10)
        val second = MyDate(2014, 7, 11)
        assertTrue(first < second, "The date ${first.s} should be before ${second.s}")
    }

    @Test
    fun testAfter() {
        val first = MyDate(2014, 10, 20)
        val second = MyDate(2014, 7, 11)
        assertTrue(first > second, "The date ${first.s} should be after ${second.s}")
    }

    /* If you declare 'compareTo' as an extension function, remove this one to make the code compile */
    operator fun MyDate.compareTo(other: MyDate): Int = todoTask25()
}