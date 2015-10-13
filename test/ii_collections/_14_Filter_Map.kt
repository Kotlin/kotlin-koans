package ii_collections

import junit.framework.Assert
import org.junit.Test
import ii_collections.data.*

class _14_Filter_Map {
    @Test fun testCitiesCustomersAreFrom() {
        Assert.assertEquals(setOf(Canberra, Vancouver, Budapest, Ankara, Tokyo), shop.getCitiesCustomersAreFrom())
    }

    /**
     * Returns the list of the customers who live in the city 'city'
     */
    @Test fun testCustomersFromCity() {
        Assert.assertEquals(listOf(customers[lucas], customers[cooper]), shop.getCustomersFrom(Canberra))
    }
}
