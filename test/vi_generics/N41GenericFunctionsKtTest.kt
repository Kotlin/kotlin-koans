package vi_generics

import org.junit.Assert.assertEquals
import org.junit.Test

class N41GenericFunctionsKtTest {
    @Test fun testPartitionWordsAndLines() {
        val (words, lines) = listOf("a", "a b", "c", "d e").partitionWordsAndLines()
        assertEquals(listOf("a", "c"), words)
        assertEquals(listOf("a b", "d e"), lines)
    }

    @Test fun testPartitionLettersAndOtherSymbols() {
        val (letters, other) = setOf('a', '%', 'r', '}').partitionLettersAndOtherSymbols()
        assertEquals(setOf('a', 'r'), letters)
        assertEquals(setOf('%', '}'), other)
    }
}