package i_introduction._4_Lambdas

import kotlin.test.*
import org.junit.Test
import org.junit.Assert

class _03_Lambdas() {
    @Test fun contains() {
        Assert.assertTrue(task3(listOf(1, 2, 3, 126, 555)))
    }

    @Test fun notContains() {
        Assert.assertFalse(task3(listOf(44)))
    }
}