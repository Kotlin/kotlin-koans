package iv_properties

import junit.framework.Assert
import org.junit.Test

class _32_Properties {
    @Test fun testPropertyWithCounter() {
        val q = PropertyExample()
        q.propertyWithCounter = 14
        q.propertyWithCounter = 21
        q.propertyWithCounter = 32
        Assert.assertEquals("The property q.changeCounter should contain the number of assignments to q.propertyWithCounter:",
                3, q.counter)
        // Here we have to use !! due to false smart cast impossible
        Assert.assertEquals("The property q.propertyWithCounter should be set:", 32, q.propertyWithCounter!!)
    }

}