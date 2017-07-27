package iv_properties

import org.junit.Assert.*
import org.junit.Test

class N33LazyPropertyKtTest {
    @Test fun testLazy() {
        var initialized = false
        val lazyProperty = LazyProperty({ initialized = true; 42 })
        assertFalse("Property shouldn't be initialized before access", initialized)
        val result: Int = lazyProperty.lazy
        assertTrue("Property should be initialized after access", initialized)
        assertEquals(42, result)
    }

    @Test fun initializedOnce() {
        var initialized = 0
        val lazyProperty = LazyProperty( { initialized++; 42 })
        lazyProperty.lazy
        lazyProperty.lazy
        assertEquals("Lazy property should be initialized once", 1, initialized)

    }
}
