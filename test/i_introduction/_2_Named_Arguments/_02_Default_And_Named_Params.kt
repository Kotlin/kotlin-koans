package i_introduction._2_Named_Arguments

import org.junit.Assert
import org.junit.Test

class _02_Default_And_Named_Params() {

    @org.junit.Test fun testJoinToString() {
        Assert.assertEquals("{1, 2, 3, 42, 555}", task2(listOf(1, 2, 3, 42, 555)))
    }

}