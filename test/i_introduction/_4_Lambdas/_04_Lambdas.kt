package i_introduction._4_Lambdas

import org.junit.Test
import org.junit.Assert

class _04_Lambdas() {
    @Test fun contains() {
        Assert.assertTrue(task4(listOf(1, 2, 3, 126, 555)))
    }

    @Test fun notContains() {
        Assert.assertFalse(task4(listOf(44)))
    }
}