package iii_conventions

import junit.framework.Assert
import org.junit.Test
import java.util.ArrayList

class _26_For_Loop {
    @Test fun testIterateOverDateRange() {
        val actualDateRange = ArrayList<MyDate>()
        iterateOverDateRange(MyDate(2014, 5, 1), MyDate(2014, 5, 5), {
            date: MyDate -> actualDateRange.add(date)
        })
        val expectedDateRange = arrayListOf(
                MyDate(2014, 5, 1), MyDate(2014, 5, 2), MyDate(2014, 5, 3), MyDate(2014, 5, 4), MyDate(2014, 5, 5))
        Assert.assertEquals("Incorrect iteration over five nice spring dates",
                expectedDateRange, actualDateRange)
    }

    @Test fun testIterateOverEmptyRange() {
        var invoked = false
        iterateOverDateRange(MyDate(2014, 1, 1), MyDate(2013, 1, 1), { invoked = true })
        Assert.assertFalse("Handler was invoked on an empty range", invoked)
    }
}