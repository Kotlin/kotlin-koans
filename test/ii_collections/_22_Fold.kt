package ii_collections

import ii_collections.data.*
import ii_collections.shopBuilders.customer
import ii_collections.shopBuilders.order
import ii_collections.shopBuilders.shop
import org.junit.Assert.assertEquals
import org.junit.Test


class _22_Fold {
    @Test fun testGetProductsOrderedByAllCustomers() {
        val testShop = shop("test shop for 'fold'") {
            customer(lucas, Canberra) {
                order(idea)
                order(webStorm)
            }
            customer(reka, Budapest) {
                order(idea)
                order(youTrack)
            }
        }
        assertEquals(setOf(idea), testShop.getSetOfProductsOrderedByEveryCustomer())
    }
}
