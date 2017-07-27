package ii_collections

import ii_collections.data.customers
import ii_collections.data.shop
import org.junit.Assert.assertEquals
import org.junit.Test

class N13IntroductionKtTest {
    @Test fun testSetOfCustomers() {
        assertEquals(customers.values.toSet(), shop.getSetOfCustomers())
    }
}
