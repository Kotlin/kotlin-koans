package iii_conventions.multiAssignemnt

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class _30_Multi_Assignment {
    @Test fun testIsLeapDay() {
        assertTrue(isLeapDay(MyDate(2016, 1, 29)))
        assertFalse(isLeapDay(MyDate(2015, 1, 29)))
    }
}