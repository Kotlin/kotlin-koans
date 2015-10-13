package ii_collections

import junit.framework.Assert
import org.junit.Test
import ii_collections.data.*

class _18_Sort {
    @Test fun testGetCustomersSortedByNumberOfOrders() {
        Assert.assertEquals(sortedCustomers, shop.getCustomersSortedByNumberOfOrders())
    }
}
