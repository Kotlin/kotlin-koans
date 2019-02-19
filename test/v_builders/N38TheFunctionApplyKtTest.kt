package v_builders.examples

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.util.*

class N38TheFunctionApplyKtTest {
    @Test
    fun testBuildString() {
        val expected = StringBuilder().apply {
            append("Numbers: ")
            for (i in 1..10) {
                append(i)
            }
        }.toString()
        val actual = buildString()
        assertEquals(expected, actual, "String should be built:")
    }

    @Test
    fun testBuildMap() {
        val expected = HashMap<Int, String>().apply {
            put(0, "0")
            for (i in 1..10) {
                put(i, "$i")
            }
        }
        val actual = buildMap()
        assertEquals(expected, actual, "Map should be filled with the right values")
    }
}
