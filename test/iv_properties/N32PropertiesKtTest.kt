package iv_properties

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class N32PropertiesKtTest {
    @Test
    fun testPropertyWithCounter() {
        val q = PropertyExample()
        q.propertyWithCounter = 14
        q.propertyWithCounter = 21
        q.propertyWithCounter = 32
        assertEquals(3, q.counter, "The property q.counter should contain the number of assignments to q.propertyWithCounter:")
        // Here we have to use !! due to false smart cast impossible
        assertEquals(32, q.propertyWithCounter!!, "The property q.propertyWithCounter should be set:")
    }

}