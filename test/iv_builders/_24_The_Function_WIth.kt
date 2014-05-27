package iv_builders.examples

import junit.framework.Assert
import org.junit.Test as test
import java.util.HashMap

class _24_The_Function_With {
    test fun testBuildString() {
        val s = buildString()
        val sb = StringBuilder()
        sb.append("Numbers: ")
        for (i in 1..10) {
            sb.append(i)
        }
        Assert.assertEquals("String should be built:", sb.toString(), s)
    }

    test fun testBuildMap() {
        val map = buildMap()
        val expected = HashMap<Int, String>()
        for (i in 0..10) {
            expected[i] = "$i"
        }
        Assert.assertEquals("Map should be filled with the right values", expected, map)
    }

    test fun testWith() {
        Assert.assertTrue(task24())
    }
}
