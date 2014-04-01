package iii_conventions

import junit.framework.Assert
import org.junit.Test as test
import iii_conventions.TimeInterval.*
import ii_properties.toMillis
import iii_conventions.test.s

class _15_In_Range {
    fun doTest(date: Date, first: Date, last: Date, shouldBeInRange: Boolean) {
        val message = "The date ${date.s} should${if (shouldBeInRange) "" else "n't"} be in range: ${first.s}..${last.s}"
        Assert.assertEquals(message, shouldBeInRange, checkInRange(date, first, last))
    }

    test fun testInRange() {
        doTest(Date(2014, 3, 22), Date(2014, 1, 1), Date(2015, 1, 1), shouldBeInRange = true)
    }

    test fun testBefore() {
        doTest(Date(2013, 3, 22), Date(2014, 1, 1), Date(2015, 1, 1), shouldBeInRange = false)
    }

    test fun testAfter() {
        doTest(Date(2015, 3, 22), Date(2014, 1, 1), Date(2015, 1, 1), shouldBeInRange = false)
    }
}