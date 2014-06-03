package v_collections

import junit.framework.Assert
import org.junit.Test as test
import v_collections.data.*

class F_Sort {
    fun testGetCustomersSortedByNumberOfOrders() {
        Assert.assertEquals(listOf(cooper, nathan, bajram, asuka, lucas, reka), shop.getCustomerWithMaximumNumberOfOrders())
    }
}
