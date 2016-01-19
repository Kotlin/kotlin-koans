package ii_collections

import org.junit.Assert.assertEquals
import org.junit.Test
import ii_collections.data.*

class _20_Group_By {
    @Test fun testGroupCustomersByCity() {
        assertEquals(groupedByCities, shop.groupCustomersByCity())
    }
}
