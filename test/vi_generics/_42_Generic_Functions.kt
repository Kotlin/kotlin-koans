package vi_generics

import junit.framework.Assert
import org.junit.Test as test
import vi_generics.generics.partitionWordsAndLines
import vi_generics.generics.partitionLettersAndOtherSymbols

public class _42_Generic_Functions {
    @test fun testPartitionWordsAndLines() {
        val (words, lines) = listOf("a", "a b", "c", "d e").partitionWordsAndLines()
        Assert.assertEquals(listOf("a", "c"), words)
        Assert.assertEquals(listOf("a b", "d e"), lines)
    }

    @test fun testPartitionLettersAndOtherSymbols() {
        val (letters, other) = setOf('a', '%', 'r', '}').partitionLettersAndOtherSymbols()
        Assert.assertEquals(setOf('a', 'r'), letters)
        Assert.assertEquals(setOf('%', '}'), other)
    }
}