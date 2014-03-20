package i_introduction._6_Smart_Casts

import kotlin.test.*
import org.junit.Test as test
import org.junit.Assert

class _6_Smart_Casts {
    test fun testNum() {
        Assert.assertEquals("'print' on Num should work:", "2", print(Num(2)))
    }

    test fun testSum() {
        Assert.assertEquals("'print' on Sum should work:", "2 + 1", print(Sum(Num(2), Num(1))))
    }
}