package util

import i_introduction._1_Java_To_Kotlin_Converter.N01JavaToKotlinConverterKtTest
import i_introduction._3_Default_Arguments.N03DefaultArgumentsKtTest
import i_introduction._4_Lambdas.N04LambdasKtTest
import i_introduction._7_Nullable_Types.N07NullableTypesKtTest
import i_introduction._8_Smart_Casts.N08SmartCastsKtTest
import ii_collections.N24ExtensionsOnCollectionsKtTest
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class AdditionalTest {
    @Test
    fun test() {
        invokeTests(
            { N01JavaToKotlinConverterKtTest().collection() },
            { N03DefaultArgumentsKtTest().testDefaultAndNamedParams() },
            { N04LambdasKtTest().contains() },
            { N07NullableTypesKtTest().everythingIsOk() },
            { N08SmartCastsKtTest().testNum() },
            { N24ExtensionsOnCollectionsKtTest().testCollectionOfOneElement() }
        )
        assertTrue(JavaCode.set.isEmpty(), "${JavaCode.set}")
    }

    private fun invokeTests(vararg tests: () -> Unit) {
        for (test in tests) {
            try {
                test()
            } catch (e: NotImplementedException) {
            }
        }
    }
}

