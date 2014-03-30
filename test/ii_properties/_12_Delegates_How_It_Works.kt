package ii_properties

import junit.framework.Assert
import org.junit.Test as test
import iii_conventions.Date

class _12_Delegates_How_It_Works {
    test fun testDate() {
        val d = D()
        d.date = Date(2014, 1, 13)
        Assert.assertEquals(2014, d.date.year)
        Assert.assertEquals(1, d.date.month)
        Assert.assertEquals(13, d.date.dayOfMonth)
    }
}