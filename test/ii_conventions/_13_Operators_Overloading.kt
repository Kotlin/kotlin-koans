package ii_conventions

import junit.framework.Assert
import org.junit.Test as test
import ii_conventions.TimeInterval.*

class _13_Operators_Overloading {
    test fun testAddTimeIntervals() {
        Assert.assertEquals(MyDate(2014, 5, 22), MyDate(1983, 5, 22).addTimeIntervals(YEAR, 31))
        Assert.assertEquals(MyDate(1983, 5, 29), MyDate(1983, 5, 22).addTimeIntervals(DAY, 7))
        Assert.assertEquals(MyDate(1983, 5, 29), MyDate(1983, 5, 22).addTimeIntervals(WEEK, 1))
    }

    test fun testOneMonth() {
        Assert.assertEquals(MyDate(2016, 0, 27), task13(MyDate(2014, 0, 1)))
    }

    test fun testMonthChange() {
        Assert.assertEquals(MyDate(2016, 1, 20), task13(MyDate(2014, 0, 25)))
    }
}
