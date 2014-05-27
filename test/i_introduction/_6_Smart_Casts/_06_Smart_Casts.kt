package i_introduction._6_Smart_Casts

import kotlin.test.*
import org.junit.Test as test
import org.junit.Assert

class _06_Smart_Casts {
    test fun testNum() {
        Assert.assertEquals("'print' on Num should work:", "2", print(Num(2)))
    }

    test fun testSum() {
        Assert.assertEquals("'print' on Sum should work:", "2 + 1", print(Sum(Num(2), Num(1))))
    }

    test fun testRecursion() {
        Assert.assertEquals("'print' should work recursively:", "1 + 2 + 3", print(Sum(Sum(Num(1), Num(2)), Num(3))))
    }
}