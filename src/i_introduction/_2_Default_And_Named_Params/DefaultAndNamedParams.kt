package i_introduction._2_Default_And_Named_Params

import util.TODO
import i_introduction._1_Functions.task1

fun bar(i: Int, s: String = "", b: Boolean = true) {}

fun usage() {
    bar(1, b = false)
}

fun todoTask2_1() = TODO(
    """
        Task 2(1).
        Rewrite all overloaded functions 'JavaCode2.foo()' to one function 'foo()' in Kotlin using default parameters.
        The function 'foo()' is declared below, you have to add parameters and replace 'todoTask2_1()' with a body.
        Uncomment the commented code and make it compile.
    """,
    references = { name: String -> JavaCode2().foo(name); foo(name) })

fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false) =
        (if (toUpperCase) name.toUpperCase() else name) + number


fun task2_1(): String {
//    todoTask2_1()
    return (foo("a") +
            foo("b", number = 1) +
            foo("c", toUpperCase = true) +
            foo(name = "d", number = 2, toUpperCase = true))
}
