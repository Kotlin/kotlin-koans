package iii_conventions

import junit.framework.Assert
import org.junit.Test as test
import iii_conventions.TimeInterval.*

class _13_Operators_Overloading {
    test fun testAddTimeIntervals() {
        Assert.assertEquals(Date(2014, 5, 22), Date(1983, 5, 22).addTimeIntervals(YEAR, 31))
        Assert.assertEquals(Date(1983, 5, 29), Date(1983, 5, 22).addTimeIntervals(DAY, 7))
        Assert.assertEquals(Date(1983, 5, 29), Date(1983, 5, 22).addTimeIntervals(WEEK, 1))
    }

    test fun testOneMonth() {
        Assert.assertEquals(Date(2016, 0, 27), task13(Date(2014, 0, 1)))
    }

    test fun testMonthChange() {
        Assert.assertEquals(Date(2016, 1, 20), task13(Date(2014, 0, 25)))
    }
}
