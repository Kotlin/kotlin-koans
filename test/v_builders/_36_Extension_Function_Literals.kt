package v_builders

import org.junit.Assert.assertEquals
import org.junit.Test

class _36_Extension_Function_Literals {
    @Test fun testIsOddAndIsEven() {
        val result = task36()
        assertEquals("The functions 'isOdd' and 'isEven' should be implemented correctly",
                listOf(false, true, true), result)

    }
}