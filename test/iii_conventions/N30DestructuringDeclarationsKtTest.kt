package iii_conventions.multiAssignemnt

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class N30DestructuringDeclarationsKtTest {
    @Test
    fun testIsLeapDay() {
        assertTrue(isLeapDay(MyDate(2016, 1, 29)))
        assertFalse(isLeapDay(MyDate(2015, 1, 29)))
    }
}
