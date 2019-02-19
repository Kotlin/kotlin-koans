package i_introduction._6_Data_Classes

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class N06DataClassesKtTest {
    @Test
    fun testListOfPeople() {
        assertEquals("[Person(name=Alice, age=29), Person(name=Bob, age=31)]", task6().toString())
    }
}