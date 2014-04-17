package iv_builders

import junit.framework.Assert
import org.junit.Test as test
import java.util.HashMap

class _22_Extension_Function_Literals {
    test fun testIsOddAndIsEven() {
        val result = task22()
        Assert.assertEquals("The functions 'isOdd' and 'isEven' should be implemented correctly",
                listOf(false, true, true), result)

    }
}