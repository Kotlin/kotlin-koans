package i_introduction._2_Named_Arguments

import i_introduction._1_Java_To_Kotlin_Converter.task1
import util.TODO
import util.doc2

// default values for arguments
fun bar(i: Int, s: String = "", b: Boolean = true) {}

fun usage() {
    // named arguments
    bar(1, b = false)
}

fun todoTask2(): Nothing = TODO(
    """
        Task 2.
        Print out the collection contents surrounded by curly braces using the library function 'joinToString'.
        Specify only 'prefix' and 'postfix' arguments.

        Don't forget to remove the 'todoTask2()' invocation which throws an exception.
    """,
    documentation = doc2(),
    references = { collection: Collection<Int> -> task1(collection); collection.joinToString() })

fun task2(collection: Collection<Int>): String {
    return collection.joinToString(prefix = "{", postfix = "}")
}
