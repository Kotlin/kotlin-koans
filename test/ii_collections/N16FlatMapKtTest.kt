package ii_collections

import ii_collections.data.*
import org.junit.Assert.assertEquals
import org.junit.Test

class N16FlatMapKtTest {
    @Test fun testGetOrderedProductsSet() {
        assertEquals(setOf(idea), customers[reka]!!.orderedProducts)
    }

    @Test fun testGetAllOrderedProducts() {
        assertEquals(orderedProducts, shop.allOrderedProducts)
    }
}
