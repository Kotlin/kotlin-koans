package iii_conventions

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test
import java.util.*

class N28ForLoopKtTest {
    /* Month numbering starts with 0 (0-Jan, 1-Feb, ... 11-Dec) */

    @Test
    fun testIterateOverDateRange() {
        val actualDateRange = ArrayList<MyDate>()
        iterateOverDateRange(MyDate(2014, 5, 1), MyDate(2014, 5, 5)) { date: MyDate ->
            actualDateRange.add(date)
        }
        val expectedDateRange = arrayListOf(
            MyDate(2014, 5, 1), MyDate(2014, 5, 2), MyDate(2014, 5, 3), MyDate(2014, 5, 4), MyDate(2014, 5, 5))
        assertEquals(expectedDateRange, actualDateRange, "Incorrect iteration over five nice spring dates")
    }

    @Test
    fun testIterateOverEmptyRange() {
        var invoked = false
        iterateOverDateRange(MyDate(2014, 1, 1), MyDate(2013, 1, 1), { invoked = true })
        assertFalse(invoked, "Handler was invoked on an empty range")
    }

    @Test
    fun testIterateOverLeapYearEndOfFebruary() {
        val actualDateRange = ArrayList<MyDate>()
        iterateOverDateRange(MyDate(2016, 1, 26), MyDate(2016, 2, 1)) { date: MyDate ->
            actualDateRange.add(date)
        }
        val expectedDateRange = arrayListOf(
            MyDate(2016, 1, 26), MyDate(2016, 1, 27), MyDate(2016, 1, 28), MyDate(2016, 1, 29), MyDate(2016, 2, 1))
        assertEquals(expectedDateRange, actualDateRange, "Incorrect iteration over nice end of February of Leap-Year")
    }

    @Test
    fun testIterateOverTheNewYear() {
        val actualDateRange = ArrayList<MyDate>()
        iterateOverDateRange(MyDate(2016, 11, 31), MyDate(2017, 0, 1)) { date: MyDate ->
            actualDateRange.add(date)
        }
        val expectedDateRange = arrayListOf(
            MyDate(2016, 11, 31), MyDate(2017, 0, 1))
        assertEquals(expectedDateRange, actualDateRange, "Incorrect iteration over the end of the year")
    }
}