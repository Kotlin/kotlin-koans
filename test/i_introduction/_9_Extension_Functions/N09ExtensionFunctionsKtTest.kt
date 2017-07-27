package i_introduction._9_Extension_Functions

import org.junit.Assert.assertEquals
import org.junit.Test

class N09ExtensionFunctionsKtTest {
    @Test fun testIntExtension() {
        assertEquals("Rational number creation error: ", RationalNumber(4, 1), 4.r())
    }

    @Test fun testPairExtension() {
        assertEquals("Rational number creation error: ", RationalNumber(2, 3), Pair(2, 3).r())
    }
}