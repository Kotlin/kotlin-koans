package v_builders

import org.junit.Assert.assertTrue
import org.junit.Test

class _39_Html_Builders {
    @Test fun productTableIsFilled() {
        val result = renderProductTable()
        assertTrue("Product table should contain corresponding data", result.contains("cactus"))
    }

    @Test fun productTableIsColored() {
        val result = renderProductTable()
        assertTrue("Product table should be colored", result.contains("bgcolor"))
    }
}
