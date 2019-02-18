package ii_collections

import ii_collections.data.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class N16FlatMapKtTest {
    @Test
    fun testGetOrderedProductsSet() {
        assertEquals(setOf(idea), customers[reka]!!.orderedProducts)
    }

    @Test
    fun testGetAllOrderedProducts() {
        assertEquals(orderedProducts, shop.allOrderedProducts)
    }
}
