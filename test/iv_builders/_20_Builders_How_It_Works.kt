package iv_builders

import junit.framework.Assert
import org.junit.Test as test
import java.util.HashMap
import com.google.common.collect.HashMultimap

class _20_Builders_How_It_Works {
    test fun testMapBuilder() {
        val map = createMapWithMapBuilder()
        val expected = HashMap<Int, String>()
        for (i in 0..10) {
            expected[i] = "$i"
        }
        Assert.assertEquals("Map should be filled with the right values", expected, map)
    }

    test fun testMultiMapBuilder() {
        val multiMap = createMultiMapWithMapBuilder()
        val expected = HashMultimap.create<Int, String>()!!
        expected.put(0, "")
        for (i in 0..9) {
            expected.put(1, "$i")
        }
        Assert.assertEquals("MultiMap should be filled with the right values", expected, multiMap)
    }
}