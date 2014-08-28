package i_introduction._2_Default_And_Named_Params

import kotlin.test.*
import org.junit.Test as test
import org.junit.Assert

class _02_Default_And_Named_Params() {

    test fun testDefaultAndNamedParams() {
        Assert.assertEquals("a42b1C42D2", task2_1())
    }

    test fun testJoinToString() {
        Assert.assertEquals("{1, 2, 3, 42, 555}", task2_2(listOf(1, 2, 3, 42, 555)))
    }

}