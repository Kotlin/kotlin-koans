package v_builders

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.util.*

class N37StringAndMapBuildersKtTest {
    @Test
    fun testBuildMap() {
        val map = task37()
        val expected = HashMap<Int, String>()
        for (i in 0..10) {
            expected[i] = "$i"
        }
        assertEquals(expected, map, "Map should be filled with the right values")
    }
}