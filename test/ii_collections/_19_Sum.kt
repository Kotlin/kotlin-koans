package ii_collections

import junit.framework.Assert
import org.junit.Test
import ii_collections.data.*

class _19_Sum {
    @Test fun testGetTotalOrderPrice() {
        Assert.assertEquals(148.0, customers[nathan]!!.getTotalOrderPrice())
    }

    @Test fun testTotalPriceForRepeatedProducts() {
        Assert.assertEquals(586.0, customers[lucas]!!.getTotalOrderPrice())
    }
}
