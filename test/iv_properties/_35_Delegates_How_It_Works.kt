package iv_properties

import iii_conventions.MyDate
import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.*

class _35_Delegates_How_It_Works {
    @Test fun testDate() {
        val d = D()
        d.date = MyDate(2014, 1, 13)
        val c = Calendar.getInstance();
        c.set(2014, 1, 13, 0, 0, 0)
        c.set(Calendar.MILLISECOND, 0)

        assertEquals(2014, d.date.year)
        assertEquals(1, d.date.month)
        assertEquals(13, d.date.dayOfMonth)
        assertEquals(c.timeInMillis.toDate(), d.date)
        assertEquals(c.timeInMillis, d.date.toMillis())
    }
}