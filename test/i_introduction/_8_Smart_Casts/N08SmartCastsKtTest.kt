package i_introduction._8_Smart_Casts

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class N08SmartCastsKtTest {
    @Test
    fun testNum() {
        assertEquals(2, eval(Num(2)), "'eval' on Num should work:")
    }

    @Test
    fun testSum() {
        assertEquals(3, eval(Sum(Num(2), Num(1))), "'eval' on Sum should work:")
    }

    @Test
    fun testRecursion() {
        assertEquals(6, eval(Sum(Sum(Num(1), Num(2)), Num(3))), "'eval' should work recursively:")
    }
}