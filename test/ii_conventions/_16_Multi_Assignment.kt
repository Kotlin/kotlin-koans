package ii_conventions.multiAssignemnt

import junit.framework.Assert
import org.junit.Test as test

class _16_Multi_Assignment {
    @test fun testIsLeapDay() {
        Assert.assertTrue(isLeapDay(MyDate(2016, 2, 29)))
        Assert.assertFalse(isLeapDay(MyDate(2015, 2, 29)))
    }
}