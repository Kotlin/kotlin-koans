package iv_builders

import junit.framework.Assert
import org.junit.Test as test

class _19_Html_Builders {
    test fun productTableIsFilled() {
        val result = renderProductTable()
        Assert.assertTrue("Product table should contain corresponding data", result.contains("cactus"))
    }

    test fun productTableIsColored() {
        val result = renderProductTable()
        Assert.assertTrue("Product table should be colored", result.contains("bgcolor"))
    }
}
