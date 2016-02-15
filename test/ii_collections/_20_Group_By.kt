package ii_collections

import ii_collections.data.groupedByCities
import ii_collections.data.shop
import org.junit.Assert.assertEquals
import org.junit.Test

class _20_Group_By {
    @Test fun testGroupCustomersByCity() {
        assertEquals(groupedByCities, shop.groupCustomersByCity())
    }
}
