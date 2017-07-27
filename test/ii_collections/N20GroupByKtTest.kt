package ii_collections

import ii_collections.data.groupedByCities
import ii_collections.data.shop
import org.junit.Assert.assertEquals
import org.junit.Test

class N20GroupByKtTest {
    @Test fun testGroupCustomersByCity() {
        assertEquals(groupedByCities, shop.groupCustomersByCity())
    }
}
