package i_introduction._2_Named_Arguments

import i_introduction._1_Java_To_Kotlin_Converter.task1
import util.TODO
import util.doc2

// default values for arguments:
fun bar(i: Int, s: String = "", b: Boolean = true) {}

fun usage() {
    // named arguments:
    bar(1, b = false)
}

fun todoTask2(): Nothing = TODO(
    """
        Task 2.
        The logic defined in 'task1' is re-inventing the wheel. The Kotlin standard library
        contains a method named 'joinToString() that can provide the exact same functionality,
        if you provide the correct arguments.

        Replace the body of the function task2(collection) with code that will
        return the result of collection.joinToString() with appropriate arguments
        as to provide the same result as task1's JavaCode1.task1(collection).
        Your solution should pass only two arguments to joinToString().
    """,
    documentation = doc2(),
    references = { collection: Collection<Int> -> task1(collection); collection.joinToString() })

fun task2(collection: Collection<Int>): String {
    todoTask2()
    return collection.joinToString()
}
