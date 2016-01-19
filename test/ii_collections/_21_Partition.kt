package ii_collections

import org.junit.Assert.assertEquals
import org.junit.Test
import ii_collections.data.*

class _21_Partition {
    @Test fun testGetCustomersWhoHaveMoreUndeliveredOrdersThanDelivered() {
        assertEquals(setOf(customers[reka]), shop.getCustomersWithMoreUndeliveredOrdersThanDelivered())
    }
}
