package iv_properties

import junit.framework.Assert
import org.junit.Test
import iii_conventions.MyDate

class _35_Delegates_How_It_Works {
    @Test fun testDate() {
        val d = D()
        d.date = MyDate(2014, 1, 13)
        Assert.assertEquals(2014, d.date.year)
        Assert.assertEquals(1, d.date.month)
        Assert.assertEquals(13, d.date.dayOfMonth)
    }
}