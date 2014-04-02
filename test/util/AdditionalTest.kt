package util

import org.junit.Test as test
import i_introduction._1_Functions._1_Functions
import junit.framework.Assert
import i_introduction._2_Default_And_Named_Params._2_Default_And_Named_Params
import i_introduction._3_Lambdas._3_Lambdas
import i_introduction._5_Nullable_Types._5_Nullable_Types
import i_introduction._6_Smart_Casts._6_Smart_Casts
import i_introduction._9_Extensions_On_Collections._9_Extensions_On_Collections

class AdditionalTest {
    test fun test() {
        invokeTests(
                { _1_Functions().collection() },
                { _2_Default_And_Named_Params().testDefaultAndNamedParams() },
                { _3_Lambdas().contains() },
                { _5_Nullable_Types().everythingIsOk() },
                { _6_Smart_Casts().testNum() },
                { _9_Extensions_On_Collections().testCollectionOfOneElement() }
        )
        Assert.assertTrue("${JavaCode.set}", JavaCode.set!!.isEmpty())
    }

    private fun invokeTests(vararg tests: () -> Unit) {
        for (test in tests) {
            try {
                test()
            }
            catch (e: NotImplementedException) {}
        }
    }
}

