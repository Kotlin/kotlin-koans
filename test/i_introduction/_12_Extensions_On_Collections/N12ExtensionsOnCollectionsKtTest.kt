package i_introduction._12_Extensions_On_Collections

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class N12ExtensionsOnCollectionsKtTest {
    @Test
    fun testSort() {
        assertEquals(listOf(5, 2, 1), task12())
    }
}
