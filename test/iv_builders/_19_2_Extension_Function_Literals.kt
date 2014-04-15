package iv_builders

import junit.framework.Assert
import org.junit.Test as test
import java.util.HashMap

class _19_2_Extension_Function_Literals {
    test fun testBuildMap() {
        val map = task19_2()
        val expected = HashMap<Int, String>()
        for (i in 0..10) {
            expected[i] = "$i"
        }
        Assert.assertEquals("Map should be filled with the right values", expected, map)

    }
}