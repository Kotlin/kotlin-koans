package i_introduction._4_Lambdas

import kotlin.test.*
import org.junit.Test as test
import org.junit.Assert

class _03_Lambdas() {
    @test fun contains() {
        Assert.assertTrue(task3(listOf(1, 2, 3, 126, 555)))
    }

    @test fun notContains() {
        Assert.assertFalse(task3(listOf(44)))
    }
}