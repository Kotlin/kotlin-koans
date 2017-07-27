package iv_properties

import org.junit.Assert.assertEquals
import org.junit.Test

class N32PropertiesKtTest {
    @Test fun testPropertyWithCounter() {
        val q = PropertyExample()
        q.propertyWithCounter = 14
        q.propertyWithCounter = 21
        q.propertyWithCounter = 32
        assertEquals("The property q.counter should contain the number of assignments to q.propertyWithCounter:",
                3, q.counter)
        // Here we have to use !! due to false smart cast impossible
        assertEquals("The property q.propertyWithCounter should be set:", 32, q.propertyWithCounter!!)
    }

}