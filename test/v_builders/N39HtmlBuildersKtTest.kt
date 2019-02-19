package v_builders

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class N39HtmlBuildersKtTest {
    @Test
    fun productTableIsFilled() {
        val result = renderProductTable()
        assertTrue(result.contains("cactus"), "Product table should contain corresponding data")
    }

    @Test
    fun productTableIsColored() {
        val result = renderProductTable()
        assertTrue(result.contains("bgcolor"), "Product table should be colored")
    }
}
