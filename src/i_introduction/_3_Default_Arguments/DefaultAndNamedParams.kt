package i_introduction._3_Default_Arguments

import util.TODO
import util.doc2

/**
 * Description of task.
 */
fun todoTask3(): Nothing = TODO(
        """
        Task 3

        Several overloads of 'JavaCode3.foo()' can be replaced with one function in Kotlin.

        The task3() function contents must be modified to remove the line "return todoTask3()"
        and un-comment the four lines starting with "return (foo("A") +".

        The goal of this task is to change the list of arguments for the function 'foo', provided
        just below, and replace the function implementation such that the code in task3() will return
        the String "a42b1C42D2".
        """,
        documentation = doc2(),
        references = { name: String -> JavaCode3().foo(name); foo(name) })

/**
 * Function to create string that contains a specified string, possibly as upper case (default is lowercase),
 * followed by a specified (or default) number. If the number is not provided, the default number should be 42.
 *
 * Optionally, complete the KDoc, here.
 * @return a string of (string, possibly upper case) with a number concatenated to it
 */
fun foo(name: String /* more arguments will go here*/): String = todoTask3()

/**
 * Modify the function body of this method as described in todoTask3().
 *
 * @return the literal string "a42b1C42D2" as computed by this function with multiple
 * calls to the foo(...) function.
 */
fun task3(): String {
    return todoTask3()
    //return (foo("a") +
    //        foo("b", number = 1) +
    //        foo("c", toUpperCase = true) +
    //        foo(name = "d", number = 2, toUpperCase = true))
}
