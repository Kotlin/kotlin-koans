package ii_collections

import ii_collections.data.*
import org.junit.Assert.assertEquals
import org.junit.Test

class N23CompoundTasksKtTest {
    @Test fun testGetCustomersWhoOrderedProduct() {
        assertEquals(setOf(customers[reka], customers[asuka]), shop.getCustomersWhoOrderedProduct(idea))
    }

    @Test fun testMostExpensiveDeliveredProduct() {
        val testShop = shop("test shop for 'most expensive delivered product'",
                customer(lucas, Canberra,
                        order(idea, isDelivered = false),
                        order(reSharper)
                )
        )
        assertEquals(reSharper, testShop.customers[0].getMostExpensiveDeliveredProduct())
    }

    @Test fun testNumberOfTimesEachProductWasOrdered() {
        assertEquals(4, shop.getNumberOfTimesProductWasOrdered(idea))
    }

    @Test fun testNumberOfTimesEachProductWasOrderedForRepeatedProduct() {
        assertEquals("A customer may order a product for several times",
                3, shop.getNumberOfTimesProductWasOrdered(reSharper))
    }

    @Test fun testNumberOfTimesEachProductWasOrderedForRepeatedInOrderProduct() {
        assertEquals("An order may contain a particular product more than once",
                3, shop.getNumberOfTimesProductWasOrdered(phpStorm))
    }
}
