package ii_collections

import junit.framework.Assert
import org.junit.Test
import ii_collections.data.*
import ii_collections.shopBuilders.*


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
        Assert.assertEquals(setOf(idea), testShop.getProductsOrderedByAllCustomers())
    }
}
