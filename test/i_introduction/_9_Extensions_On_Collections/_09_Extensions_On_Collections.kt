package i_introduction._9_Extensions_On_Collections

import kotlin.test.*
import org.junit.Test as test
import org.junit.Assert

class _09_Extensions_On_Collections {
    test fun testCollectionOfOneElement() {
        doTest(listOf("a"), listOf("a"))
    }

    test fun testEmptyCollection() {
        doTest(null, listOf())
    }

    test fun testSimpleCollection() {
        doTest(listOf("a", "c"), listOf("a", "bb", "c"))
    }

    test fun testCollectionWithEmptyStrings() {
        doTest(listOf("", "", "", ""), listOf("", "", "", "", "a", "bb", "ccc", "dddd"))
    }

    test fun testCollectionWithTwoGroupsOfMaximalSize() {
        doTest(listOf("a", "c"), listOf("a", "bb", "c", "dd"))
    }

    private fun doTest(expected: Collection<String>?, argument: Collection<String>) {
        Assert.assertEquals("The function 'doSomethingStrangeWithCollection' should do at least something with a collection:",
                expected, doSomethingStrangeWithCollection(argument))
    }
}