package i_introduction._8_Smart_Casts

import org.junit.Assert.assertEquals
import org.junit.Test

class N08SmartCastsKtTest {
    @Test fun testNum() {
        assertEquals("'eval' on Num should work:", 2, eval(Num(2)))
    }

    @Test fun testSum() {
        assertEquals("'eval' on Sum should work:", 3, eval(Sum(Num(2), Num(1))))
    }

    @Test fun testRecursion() {
        assertEquals("'eval' should work recursively:", 6, eval(Sum(Sum(Num(1), Num(2)), Num(3))))
    }
}