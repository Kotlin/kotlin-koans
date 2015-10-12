package i_introduction._2_Default_And_Named_Params

import util.*

fun todoTask2_1(): Nothing = TODO(
    """
        Task 2(1).
        Rewrite all overloaded functions 'JavaCode2.foo()' as one function 'foo()' in Kotlin using default parameters.
        The function 'foo()' is declared below; you have to add parameters and replace 'todoTask2_1()' with a real body.
        Uncomment the commented code and make it compile.
    """,
    documentation = doc2(),
    references = { name: String -> JavaCode2().foo(name); foo(name) })

fun foo(name: String): String = todoTask2_1()

fun task2_1(): String {
    todoTask2_1()
//    return (foo("a") +
//            foo("b", number = 1) +
//            foo("c", toUpperCase = true) +
//            foo(name = "d", number = 2, toUpperCase = true))
}
