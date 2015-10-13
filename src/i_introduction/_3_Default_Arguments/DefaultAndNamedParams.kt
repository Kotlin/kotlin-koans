package i_introduction._3_Default_Arguments

import util.*

fun todoTask3_() = TODO(
    """
        Task 3.
        Several overloads of 'JavaCode2.foo()' can be replaced with one function in Kotlin.
        Change the declaration of the function 'foo' in a way that makes the code using 'foo' compile.
        You have to add parameters and replace 'todoTask3()' with a real body.
        Uncomment the commented code and make it compile.
    """,
    documentation = doc2(),
    references = { name: String -> JavaCode2().foo(name); foo(name) })

fun foo(name: String): String = todoTask3_()

fun task3_(): String {
    todoTask3_()
//    return (foo("a") +
//            foo("b", number = 1) +
//            foo("c", toUpperCase = true) +
//            foo(name = "d", number = 2, toUpperCase = true))
}
