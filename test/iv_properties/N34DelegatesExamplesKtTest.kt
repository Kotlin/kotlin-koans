package iv_properties

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class N34DelegatesExamplesKtTest {
    @Test
    fun testLazy() {
        var initialized = false
        val lazyProperty = LazyPropertyUsingDelegates { initialized = true; 42 }
        assertFalse(initialized, "Property shouldn't be initialized before access")
        val result: Int = lazyProperty.lazyValue
        assertTrue(initialized, "Property should be initialized after access")
        assertEquals(42, result)
    }

    @Test
    fun initializedOnce() {
        var initialized = 0
        val lazyProperty = LazyPropertyUsingDelegates { initialized++; 42 }
        lazyProperty.lazyValue
        lazyProperty.lazyValue
        assertEquals(1, initialized, "Lazy property should be initialized once")

    }
}