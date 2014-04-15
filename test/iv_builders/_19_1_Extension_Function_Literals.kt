package iv_builders

import junit.framework.Assert
import org.junit.Test as test
import java.util.HashMap

class _19_1_Extension_Function_Literals {
    test fun testIsOddAndIsEven() {
        val result = task19_1()
        Assert.assertEquals("The functions 'isOdd' and 'isEven' should be implemented correctly",
                listOf(false, true, true), result)

    }
}