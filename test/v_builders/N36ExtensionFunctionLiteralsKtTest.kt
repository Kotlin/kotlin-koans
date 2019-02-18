package v_builders

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class N36ExtensionFunctionLiteralsKtTest {
    @Test
    fun testIsOddAndIsEven() {
        val result = task36()
        assertEquals(listOf(false, true, true), result, "The functions 'isOdd' and 'isEven' should be implemented correctly")

    }
}