package v_collections

import junit.framework.Assert
import org.junit.Test as test
import v_collections.data.*

class H_Group_By {
    test fun testGroupCustomersByCity() {
        Assert.assertEquals(groupedByCities, shop.groupCustomersByCity())
    }
}
