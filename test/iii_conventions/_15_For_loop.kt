package iii_conventions

import junit.framework.Assert
import org.junit.Test as test
import iii_conventions.TimeInterval.*
import java.util.ArrayList

class _15_For_Loop {
    test fun testIterateOverDateRange() {
        val actualDateRange = ArrayList<Date>()
        iterateOverDateRange(Date(2014, 5, 1), Date(2014, 5, 5), {
            (date: Date) -> actualDateRange.add(date)
        })
        val expectedDateRange = arrayListOf(
                Date(2014, 5, 1), Date(2014, 5, 2), Date(2014, 5, 3), Date(2014, 5, 4), Date(2014, 5, 5))
        Assert.assertEquals("Incorrect iteration over five nice spring dates",
                expectedDateRange, actualDateRange)
    }

    test fun testIterateOverEmptyRange() {
        var invoked = false
        iterateOverDateRange(Date(2014, 1, 1), Date(2013, 1, 1), { invoked = true })
        Assert.assertFalse("Handler was invoked on an empty range", invoked)
    }
}