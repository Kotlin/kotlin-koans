package v_builders

import junit.framework.Assert
import org.junit.Test
import java.util.HashMap

class _36_Extension_Function_Literals {
    @Test fun testIsOddAndIsEven() {
        val result = task36()
        Assert.assertEquals("The functions 'isOdd' and 'isEven' should be implemented correctly",
                listOf(false, true, true), result)

    }
}