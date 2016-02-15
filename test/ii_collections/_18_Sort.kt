package ii_collections

import ii_collections.data.shop
import ii_collections.data.sortedCustomers
import org.junit.Assert.assertEquals
import org.junit.Test

class _18_Sort {
    @Test fun testGetCustomersSortedByNumberOfOrders() {
        assertEquals(sortedCustomers, shop.getCustomersSortedByNumberOfOrders())
    }
}
