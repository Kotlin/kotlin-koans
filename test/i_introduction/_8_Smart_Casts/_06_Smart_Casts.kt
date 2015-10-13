package i_introduction._8_Smart_Casts

import org.junit.Assert
import org.junit.Test

class _06_Smart_Casts {
    @Test fun testNum() {
        Assert.assertEquals("'eval' on Num should work:", 2, eval(Num(2)))
    }

    @Test fun testSum() {
        Assert.assertEquals("'eval' on Sum should work:", 3, eval(Sum(Num(2), Num(1))))
    }

    @Test fun testRecursion() {
        Assert.assertEquals("'eval' should work recursively:", 6, eval(Sum(Sum(Num(1), Num(2)), Num(3))))
    }
}