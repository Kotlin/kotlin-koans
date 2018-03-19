package ii_collections

import ii_collections.data.*
import org.junit.Assert.assertEquals
import org.junit.Test


class N22FoldKtTest {
    @Test fun testGetProductsOrderedByAllCustomers() {
        val testShop = shop("test shop for 'fold'",
                customer(lucas, Canberra,
                        order(idea),
                        order(webStorm)
                ),
                customer(reka, Budapest,
                        order(idea),
                        order(youTrack)
                )
        )
        assertEquals(setOf(idea), testShop.getSetOfProductsOrderedByEachCustomer())
    }
}
