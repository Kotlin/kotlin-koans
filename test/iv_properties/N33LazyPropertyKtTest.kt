package iv_properties

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class N33LazyPropertyKtTest {
    @Test
    fun testLazy() {
        var initialized = false
        val lazyProperty = LazyProperty { initialized = true; 42 }
        assertFalse(initialized, "Property shouldn't be initialized before access")
        val result: Int = lazyProperty.lazy
        assertTrue(initialized, "Property should be initialized after access")
        assertEquals(42, result)
    }

    @Test
    fun initializedOnce() {
        var initialized = 0
        val lazyProperty = LazyProperty({ initialized++; 42 })
        lazyProperty.lazy
        lazyProperty.lazy
        assertEquals(1, initialized, "Lazy property should be initialized once")

    }
}
