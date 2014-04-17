package iii_properties

import junit.framework.Assert
import org.junit.Test as test
import java.util.HashMap

class _20_Delegates_Examples {
    test fun testCommodity() {
        val data = hashMapOf<String, Any?>("description" to "snowboard", "price" to 349, "isAvailable" to true)
        val p = Commodity(data)
        Assert.assertEquals("snowboard", p.description)
        Assert.assertEquals(349, p.price)
        Assert.assertEquals(true, p.isAvailable)

        data["price"] = 421
        Assert.assertEquals("Commodity class should reflect the data in map", 421, p.price)

        p.isAvailable = false
        Assert.assertEquals("The data in map should reflect the commodity class", false, data["isAvailable"])
    }
}