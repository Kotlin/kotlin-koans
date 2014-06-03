package v_collections

import junit.framework.Assert
import org.junit.Test as test
import v_collections.data.*

class F_Sort {
    test fun testGetCustomersSortedByNumberOfOrders() {
        Assert.assertEquals(sortedCustomers, shop.getCustomersSortedByNumberOfOrders())
    }
}
