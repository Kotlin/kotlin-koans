package i_introduction._6_Data_Classes

import kotlin.test.*
import org.junit.Test as test
import org.junit.Assert


public class _07_Data_Classes {
    @test fun testListOfPeople() {
        Assert.assertEquals("[Person(name=Alice, age=29), Person(name=Bob, age=31)]", task7().toString())
    }
}