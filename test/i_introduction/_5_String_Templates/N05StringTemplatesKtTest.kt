package i_introduction._5_String_Templates

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class N05StringTemplatesKtTest {
    @Test
    fun match() {
        assertTrue("11 MAR 1952".matches(task5().toRegex()))
    }

    @Test
    fun match1() {
        assertTrue("24 AUG 1957".matches(task5().toRegex()))
    }

    @Test
    fun doNotMatch() {
        assertFalse("24 RRR 1957".matches(task5().toRegex()))
    }
}
