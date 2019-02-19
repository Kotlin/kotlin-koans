package ii_collections

import ii_collections.data.shop
import ii_collections.data.sortedCustomers
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class N18SortKtTest {
    @Test
    fun testGetCustomersSortedByNumberOfOrders() {
        assertEquals(sortedCustomers, shop.getCustomersSortedByNumberOfOrders())
    }
}
