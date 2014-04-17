package ii_conventions

import junit.framework.Assert
import org.junit.Test as test
import ii_conventions.TimeInterval.*

class _15_Operators_Overloading {
    test fun testAddTimeIntervals() {
        Assert.assertEquals(MyDate(2014, 5, 22), MyDate(1983, 5, 22).addTimeIntervals(YEAR, 31))
        Assert.assertEquals(MyDate(1983, 5, 29), MyDate(1983, 5, 22).addTimeIntervals(DAY, 7))
        Assert.assertEquals(MyDate(1983, 5, 29), MyDate(1983, 5, 22).addTimeIntervals(WEEK, 1))
    }

    test fun testAddOneTimeInterval() {
        Assert.assertEquals(MyDate(2015, 5, 8), task15_1(MyDate(2014, 5, 1)))
    }

    test fun testOneMonth() {
        Assert.assertEquals(MyDate(2016, 0, 27), task15_2(MyDate(2014, 0, 1)))
    }

    test fun testMonthChange() {
        Assert.assertEquals(MyDate(2016, 1, 20), task15_2(MyDate(2014, 0, 25)))
    }
}
