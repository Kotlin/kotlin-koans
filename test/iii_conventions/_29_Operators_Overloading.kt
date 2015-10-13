package iii_conventions

import junit.framework.Assert
import org.junit.Test
import iii_conventions.TimeInterval.*

class _29_Operators_Overloading {
    @Test fun testAddTimeIntervals() {
        Assert.assertEquals(MyDate(2014, 5, 22), MyDate(1983, 5, 22).addTimeIntervals(YEAR, 31))
        Assert.assertEquals(MyDate(1983, 5, 29), MyDate(1983, 5, 22).addTimeIntervals(DAY, 7))
        Assert.assertEquals(MyDate(1983, 5, 29), MyDate(1983, 5, 22).addTimeIntervals(WEEK, 1))
    }

    @Test fun testAddOneTimeInterval() {
        Assert.assertEquals(MyDate(2015, 5, 8), task29_1(MyDate(2014, 5, 1)))
    }

    @Test fun testOneMonth() {
        Assert.assertEquals(MyDate(2016, 0, 27), task29_2(MyDate(2014, 0, 1)))
    }

    @Test fun testMonthChange() {
        Assert.assertEquals(MyDate(2016, 1, 20), task29_2(MyDate(2014, 0, 25)))
    }
}
