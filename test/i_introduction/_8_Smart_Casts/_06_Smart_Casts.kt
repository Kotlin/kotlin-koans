package i_introduction._8_Smart_Casts

import org.junit.Assert
import org.junit.Test as test

class _06_Smart_Casts {
    @test fun testNum() {
        Assert.assertEquals("'eval' on Num should work:", 2, eval(Num(2)))
    }

    @test fun testSum() {
        Assert.assertEquals("'eval' on Sum should work:", 3, eval(Sum(Num(2), Num(1))))
    }

    @test fun testRecursion() {
        Assert.assertEquals("'eval' should work recursively:", 6, eval(Sum(Sum(Num(1), Num(2)), Num(3))))
    }
}