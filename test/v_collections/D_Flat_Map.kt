package v_collections

import junit.framework.Assert
import org.junit.Test as test
import v_collections.data.*

class D_Flat_Map {
    test fun testGetOrderedProductsSet() {
        Assert.assertEquals(setOf(idea), customers[reka]!!.orderedProducts)
    }

    test fun testGetAllOrderedProducts() {
        Assert.assertEquals(orderedProducts, shop.allOrderedProducts)
    }
}
