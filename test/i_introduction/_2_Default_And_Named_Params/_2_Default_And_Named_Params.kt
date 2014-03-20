package i_introduction._2_Default_And_Named_Params

import kotlin.test.*
import org.junit.Test as test
import org.junit.Assert

class _2_Default_And_Named_Params() {

    test fun testDefaultAndNamedParams() {
        Assert.assertEquals("a42b1C42D2", testFoo())
    }

    test fun testMakeString() {
        Assert.assertEquals("{1, 2, 3, 42, 555}", task2(listOf(1, 2, 3, 42, 555)))
    }

}