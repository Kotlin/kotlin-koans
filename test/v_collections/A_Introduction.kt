package v_collections

import junit.framework.Assert
import org.junit.Test as test
import v_collections.data.*

class A_Introduction {
    test fun testSetOfCustomers() {
        Assert.assertEquals(shop.getSetOfCustomers(), customers.values().toSet())
    }
}
