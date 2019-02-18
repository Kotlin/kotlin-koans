package iv_properties

import iii_conventions.MyDate
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class N35HowDelegatesWorkKtTest {
    @Test
    fun testDate() {
        val d = D()
        /* Month numbering starts with 0 (0-Jan, 1-Feb, ... 11-Dec) */
        d.date = MyDate(2014, 1, 13)
        assertEquals(2014, d.date.year)
        assertEquals(1, d.date.month)
        assertEquals(13, d.date.dayOfMonth)
    }
}
