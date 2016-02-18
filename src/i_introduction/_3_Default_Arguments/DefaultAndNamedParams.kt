package i_introduction._3_Default_Arguments

import util.TODO
import util.doc2

fun todoTask3(): Nothing = TODO(
    """
        Task 3.
        Several overloads of 'JavaCode3.foo()' can be replaced with one function in Kotlin.

        The task3() function contents must be modified to remove the line "return todoTask3()"
        and un-comment the four lines starting with "return (foo("A") +".

        The goal of this task is to change the list of arguments for the function 'foo', provided
        just below, and replace the function implementation such that the code in task3() will return
        the String "a42b1C42D2".
    """,
    documentation = doc2(),
    references = { name: String -> JavaCode3().foo(name); foo(name) })

fun foo(name: String): String = todoTask3()

fun task3(): String {
    return todoTask3()
    //return (foo("a") +
    //        foo("b", number = 1) +
    //        foo("c", toUpperCase = true) +
    //        foo(name = "d", number = 2, toUpperCase = true))
}
