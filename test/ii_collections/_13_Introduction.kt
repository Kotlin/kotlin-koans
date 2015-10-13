package ii_collections

import junit.framework.Assert
import org.junit.Test
import ii_collections.data.*

class _13_Introduction {
    @Test fun testSetOfCustomers() {
        Assert.assertEquals(shop.getSetOfCustomers(), customers.values().toSet())
    }
}
