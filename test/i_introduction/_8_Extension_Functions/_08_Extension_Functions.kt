package i_introduction._8_Extension_Functions.StringExtensions

import kotlin.test.*
import org.junit.Test as test
import org.junit.Assert

class _08_Extension_Functions() {
    test fun testIntExtension() {
        Assert.assertEquals("Rational number creation error: ", RationalNumber(4, 1), 4.r())
    }

    test fun testPairExtension() {
        Assert.assertEquals("Rational number creation error: ", RationalNumber(2, 3), Pair(2, 3).r())
    }
}