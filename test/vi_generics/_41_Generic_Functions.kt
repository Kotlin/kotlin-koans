package vi_generics

import junit.framework.Assert
import org.junit.Test

public class _41_Generic_Functions {
    @Test fun testPartitionWordsAndLines() {
        val (words, lines) = listOf("a", "a b", "c", "d e").partitionWordsAndLines()
        Assert.assertEquals(listOf("a", "c"), words)
        Assert.assertEquals(listOf("a b", "d e"), lines)
    }

    @Test fun testPartitionLettersAndOtherSymbols() {
        val (letters, other) = setOf('a', '%', 'r', '}').partitionLettersAndOtherSymbols()
        Assert.assertEquals(setOf('a', 'r'), letters)
        Assert.assertEquals(setOf('%', '}'), other)
    }
}