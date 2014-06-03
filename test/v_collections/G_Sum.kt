package v_collections

import junit.framework.Assert
import org.junit.Test as test
import v_collections.data.*

class G_Sum {
    test fun testGetTotalOrderPrice() {
        Assert.assertEquals(148.0, customers[nathan]!!.getTotalOrderPrice())
    }
}
