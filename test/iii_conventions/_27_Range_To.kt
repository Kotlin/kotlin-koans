package iii_conventions

import junit.framework.Assert
import org.junit.Test
import java.util.ArrayList

class _27_Range_To {
    @Test fun testIterateOverDateRange() {
        val actualDateRange = ArrayList<MyDate>()
        iterateOverDateRange2(MyDate(2014, 5, 1), MyDate(2014, 5, 2), {
            date: MyDate -> actualDateRange.add(date)
        })
        val expectedDateRange = arrayListOf(MyDate(2014, 5, 1), MyDate(2014, 5, 2))
        Assert.assertEquals("Incorrect iteration", expectedDateRange, actualDateRange)
    }
}