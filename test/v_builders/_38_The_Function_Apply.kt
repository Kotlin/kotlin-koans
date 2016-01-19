package v_builders.examples

import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.HashMap

class _38_The_Function_Apply {
    @Test fun testBuildString() {
        val expected = buildString()
        val actual = StringBuilder().myApply {
            append("Numbers: ")
            for (i in 1..10) {
                append(i)
            }
        }.toString()
        assertEquals("String should be built:", expected, actual)
    }

    @Test fun testBuildMap() {
        val expected = buildMap()
        val actual = HashMap<Int, String>().myApply {
            put(0, "0")
            for (i in 1..10) {
                put(i, "$i")
            }
        }
        assertEquals("Map should be filled with the right values", expected, actual)
    }
}
