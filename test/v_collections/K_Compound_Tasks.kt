package v_collections

import junit.framework.Assert
import org.junit.Test as test
import v_collections.data.*
import v_collections.shopBuilders.customer
import v_collections.shopBuilders.order

class K_Compound_Tasks {
    test fun testGetCustomersWhoOrderedProduct() {
        Assert.assertEquals(setOf(customers[reka], customers[asuka]), shop.getCustomersWhoOrderedProduct(idea))
    }

    test fun testMostExpensiveDeliveredProduct() {
        val testShop = v_collections.shopBuilders.shop("test shop for 'most expensive delivered product'") {
            customer(lucas, Canberra) {
                order(isDelivered = false, products = idea)
                order(reSharper)
            }
        }
        Assert.assertEquals(reSharper, testShop.customers[0].getMostExpensiveDeliveredProduct())
    }

    test fun testNumberOfTimesEachProductWasOrdered() {
        Assert.assertEquals(3, shop.getNumberOfTimesProductWasOrdered(reSharper))
    }
}
