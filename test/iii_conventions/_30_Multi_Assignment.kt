package iii_conventions.multiAssignemnt

import junit.framework.Assert
import org.junit.Test

class _30_Multi_Assignment {
    @Test fun testIsLeapDay() {
        Assert.assertTrue(isLeapDay(MyDate(2016, 2, 29)))
        Assert.assertFalse(isLeapDay(MyDate(2015, 2, 29)))
    }
}