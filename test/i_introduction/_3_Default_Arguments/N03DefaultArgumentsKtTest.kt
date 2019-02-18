package i_introduction._3_Default_Arguments

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class N03DefaultArgumentsKtTest {

    @Test
    fun testDefaultAndNamedParams() {
        assertEquals("a42b1C42D2", task3())
    }
}