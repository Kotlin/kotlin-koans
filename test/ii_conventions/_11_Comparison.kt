package ii_conventions

import junit.framework.Assert
import org.junit.Test as test
import ii_conventions.test.s

class _11_Comparison {
    test fun testDateComparison() {
        Assert.assertTrue(task11(MyDate(2014, 1, 1), MyDate(2014, 1, 2)))
    }

    test fun testBefore() {
        val first = MyDate(2014, 5, 10)
        val second = MyDate(2014, 7, 11)
        Assert.assertTrue("The date ${first.s} should be before ${second.s}", first < second)
    }

    test fun testAfter() {
        val first = MyDate(2014, 10, 20)
        val second = MyDate(2014, 7, 11)
        Assert.assertTrue("The date ${first.s} should be after ${second.s}", first > second)
    }

    fun MyDate.compareTo(other: MyDate): Int = todoTask11()
}