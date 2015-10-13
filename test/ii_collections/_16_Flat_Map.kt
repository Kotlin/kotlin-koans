package ii_collections

import junit.framework.Assert
import org.junit.Test
import ii_collections.data.*

class _16_Flat_Map {
    @Test fun testGetOrderedProductsSet() {
        Assert.assertEquals(setOf(idea), customers[reka]!!.orderedProducts)
    }

    @Test fun testGetAllOrderedProducts() {
        Assert.assertEquals(orderedProducts, shop.allOrderedProducts)
    }
}
