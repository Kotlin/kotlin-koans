package i_introduction._6_Data_Classes

import util.*

fun todoTask6(): Nothing = TODO(
    """
        Convert 'JavaCode6.Person' class to Kotlin.
        Then add an annotation `data` to the resulting class.
        This annotation means the compiler will generate a bunch of useful methods in this class: `equals`/`hashCode`, `toString` and some others.
        The `task6` function should return a list of persons.
    """,
    documentation = doc6(),
    references = { JavaCode6.Person("Alice", 29) }
)

data class Person(val name: String, val age: Int)

fun task6(): List<Person> {
//    todoTask6()
    return listOf(Person("Alice", 29), Person("Bob", 31))
}

