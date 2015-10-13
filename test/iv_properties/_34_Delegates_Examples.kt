package iv_properties

import junit.framework.Assert
import org.junit.Test

class _34_Delegates_Examples {
    @Test fun testLazy() {
        var initialized = false
        val lazyProperty = LazyPropertyUsingDelegates({ initialized = true; 42 })
        Assert.assertFalse("Property shouldn't be initialized before access", initialized)
        val result: Int = lazyProperty.lazy
        Assert.assertTrue("Property should be initialized after access", initialized)
        Assert.assertEquals(42, result)
    }

    @Test fun initializedOnce() {
        var initialized = 0
        val lazyProperty = LazyPropertyUsingDelegates( { initialized++; 42 })
        lazyProperty.lazy
        lazyProperty.lazy
        Assert.assertEquals("Lazy property should be initialized once", 1, initialized)

    }
}