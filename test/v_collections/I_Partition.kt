package v_collections

import junit.framework.Assert
import org.junit.Test as test
import v_collections.data.*

class I_Partition {
    test fun testGetCustomersWhoHaveMoreUndeliveredOrdersThanDelivered() {
        Assert.assertEquals(setOf(customers[reka]), shop.getCustomersWithMoreUndeliveredOrdersThanDelivered())
    }
}
