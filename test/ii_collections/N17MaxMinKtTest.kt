package ii_collections

import ii_collections.data.*
import org.junit.Assert.assertEquals
import org.junit.Test

class N17MaxMinKtTest {
    @Test fun testCustomerWithMaximumNumberOfOrders() {
        assertEquals(customers[reka], shop.getCustomerWithMaximumNumberOfOrders())
    }

    @Test fun testTheMostExpensiveOrderedProduct() {
        assertEquals(rubyMine, customers[nathan]!!.getMostExpensiveOrderedProduct())
    }
}
