package v_collections

import junit.framework.Assert
import org.junit.Test as test
import v_collections.data.*
import v_collections.shopBuilders.*


class J_Fold {
    test fun testGetProductsOrderedByAllCustomers() {
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
        Assert.assertEquals(setOf(idea), testShop.getProductsOrderedByAllCustomers())
    }
}
