package i_introduction._9_Extensions_On_Collections

import util.TODO

data class User(val name: String, val lastName: String, val age: Int)

fun operationsWithCollections() {
    val users = listOf(
            User("John", "Doe", 19),
            User("Jane", "Doe", 22)
    )

    // Iterate over collection:
    for (user in users) {
    }

    val minors = users.filter { u -> u.age < 21 }
    println("${minors.size()} user(s) under 21 years old")

    val youngestOver20 = users filter { u -> u.age > 20 } minBy { u -> u.age }
    println("Youngest over 20: $youngestOver20")
}

fun operationsWithMaps() {

    val map = hashMapOf(1 to "one", 3 to "three", 42 to "forty two")

    // Iterate over map:
    for ((key, value) in map) {
    }

    // Convenient way to access elements:
    map[43] = map[42] + " plus one"

    // The details on how this code works may be found in the 'Conventions' task, later in this tutorial.

    println(map)
}

fun main(args: Array<String>) {
    operationsWithCollections()
    operationsWithMaps()
}

fun todoTask9() = TODO(
    """
        Task 9.
        The function should behave the same as 'JavaCode9.doSomethingStrangeWithCollection'
        Replace all invocations of 'todoTask9()' with the appropriate code.
    """,
    references = { c: Collection<String> -> JavaCode9().doSomethingStrangeWithCollection(c) }
)

fun doSomethingStrangeWithCollection(collection: Collection<String>): Collection<String>? {
    val groupsByLength = collection. groupBy { s -> todoTask9() }

    val maximumSizeOfGroup = groupsByLength. values(). map { group -> todoTask9() }. max()

    return groupsByLength. values(). firstOrNull { group -> todoTask9() }
}

