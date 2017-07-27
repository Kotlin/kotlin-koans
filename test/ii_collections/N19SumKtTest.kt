package ii_collections

import ii_collections.data.customers
import ii_collections.data.lucas
import ii_collections.data.nathan
import org.junit.Assert.assertEquals
import org.junit.Test

class N19SumKtTest {
    @Test fun testGetTotalOrderPrice() {
        assertEquals(148.0, customers[nathan]!!.getTotalOrderPrice(), 0.001)
    }

    @Test fun testTotalPriceForRepeatedProducts() {
        assertEquals(586.0, customers[lucas]!!.getTotalOrderPrice(), 0.001)
    }
}
