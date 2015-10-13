package v_builders.examples

import junit.framework.Assert
import org.junit.Test
import java.util.HashMap

class _24_The_Function_With {
    @Test fun testBuildString() {
        val expected = buildString()
        val actual = StringBuilder()
        myWith (actual) {
            append("Numbers: ")
            for (i in 1..10) {
                append(i)
            }
        }
        Assert.assertEquals("String should be built:", expected, actual.toString())
    }

    @Test fun testBuildMap() {
        val expected = buildMap()
        val actual = HashMap<Int, String>()
        myWith (actual) {
            put(0, "0")
            for (i in 1..10) {
                put(i, "$i")
            }
        }
        Assert.assertEquals("Map should be filled with the right values", expected, actual)
    }
}
