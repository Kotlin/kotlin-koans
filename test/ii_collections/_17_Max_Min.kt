package ii_collections

import junit.framework.Assert
import org.junit.Test
import ii_collections.data.*

class _17_Max_Min {
    @Test fun testCustomerWithMaximumNumberOfOrders() {
        Assert.assertEquals(customers[reka], shop.getCustomerWithMaximumNumberOfOrders())
    }

    @Test fun testTheMostExpensiveOrderedProduct() {
        Assert.assertEquals(rubyMine, customers[nathan]!!.getMostExpensiveOrderedProduct())
    }
}
