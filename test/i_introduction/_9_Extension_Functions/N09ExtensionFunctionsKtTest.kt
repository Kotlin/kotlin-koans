package i_introduction._9_Extension_Functions

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class N09ExtensionFunctionsKtTest {
    @Test
    fun testIntExtension() {
        assertEquals(RationalNumber(4, 1), 4.r(), "Rational number creation error: ")
    }

    @Test
    fun testPairExtension() {
        assertEquals(RationalNumber(2, 3), Pair(2, 3).r(), "Rational number creation error: ")
    }
}