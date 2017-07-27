package i_introduction._5_String_Templates

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import java.util.regex.Pattern

class N05StringTemplatesKtTest {
    @Test fun match() {
        assertTrue("11 MAR 1952".matches(task5().toRegex()))
    }

    @Test fun match1() {
        assertTrue("24 AUG 1957".matches(task5().toRegex()))
    }

    @Test fun doNotMatch() {
        assertFalse("24 RRR 1957".matches(task5().toRegex()))
    }
}
