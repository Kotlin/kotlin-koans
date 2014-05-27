package util

import org.junit.Test as test
import i_introduction._1_Functions._01_Functions
import junit.framework.Assert
import i_introduction._2_Default_And_Named_Params._02_Default_And_Named_Params
import i_introduction._3_Lambdas._03_Lambdas
import i_introduction._5_Nullable_Types._05_Nullable_Types
import i_introduction._6_Smart_Casts._06_Smart_Casts
import i_introduction._9_Extensions_On_Collections._09_Extensions_On_Collections

class AdditionalTest {
    test fun test() {
        invokeTests(
                { _01_Functions().collection() },
                { _02_Default_And_Named_Params().testDefaultAndNamedParams() },
                { _03_Lambdas().contains() },
                { _05_Nullable_Types().everythingIsOk() },
                { _06_Smart_Casts().testNum() },
                { _09_Extensions_On_Collections().testCollectionOfOneElement() }
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

