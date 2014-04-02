package iv_builders

import junit.framework.Assert
import org.junit.Test as test
import java.util.HashMap

class _20_Builders_How_It_Works {
    test fun testMapBuilder() {
        val map = createMapWithMapBuilder()
        val expected = HashMap<Int, String>()
        for (i in 0..10) {
            expected[i] = "$i"
        }
        Assert.assertEquals("Map should be filled with the right values", expected, map)
    }
}