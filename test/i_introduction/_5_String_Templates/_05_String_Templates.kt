package i_introduction._5_String_Templates

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import java.util.regex.Pattern

class _05_String_Templates() {
    @Test fun match() {
        assertTrue(Pattern.compile(task5()).matcher("Douglas Adams (11 MAR 1952)").find())
    }

    @Test fun match1() {
        assertTrue(Pattern.compile(task5()).matcher("Stephen Fry (24 AUG 1957)").find())
    }

    @Test fun doNotMatch() {
        assertFalse(Pattern.compile(task5()).matcher("Stephen Fry (24 RRR 1957)").find())
    }
}