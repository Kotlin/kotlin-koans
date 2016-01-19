package ii_collections

import org.junit.Assert.assertEquals
import org.junit.Test
import ii_collections.data.*

class _18_Sort {
    @Test fun testGetCustomersSortedByNumberOfOrders() {
        assertEquals(sortedCustomers, shop.getCustomersSortedByNumberOfOrders())
    }
}
