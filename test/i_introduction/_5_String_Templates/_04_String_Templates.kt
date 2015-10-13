package i_introduction._5_String_Templates

import kotlin.test.*
import org.junit.Test
import org.junit.Assert
import java.util.regex.Pattern

class _04_String_Templates() {
    @Test fun match() {
        Assert.assertTrue(Pattern.compile(task4()).matcher("Douglas Adams (11 MAR 1952)").find())
    }

    @Test fun match1() {
        Assert.assertTrue(Pattern.compile(task4()).matcher("Stephen Fry (24 AUG 1957)").find())
    }

    @Test fun doNotMatch() {
        Assert.assertFalse(Pattern.compile(task4()).matcher("Stephen Fry (24 RRR 1957)").find())
    }
}