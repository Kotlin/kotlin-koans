package i_introduction._12_Extensions_On_Collections

import util.TODO
import util.doc12

/**
 * Description of task.
 */
fun todoTask12(): Nothing = TODO(
        """
        Task 12

        The Kotlin standard library includes many extension functions, making the Java standard library
        easier to use and more convenient.

        One of the additions Kotlin makes to the Java standard library is adding the sortedDescending()
        to Java's Collection object.

        Rewrite the previous example once more using Kotin's Collection extension function 'sortedDescending()'.

        Because Kotlin can extend existing Java classes, it wasn't necessary for Kotin to introduce their
        own Collection-related classes. Kotlin mere using the existing Java classes but improves them.

        Read about read-only and mutable views on Java collections.
        """,
        documentation = doc12()
)

/**
 * MODIFY the function body of this method as described in todoTask11().
 * The ideal solution to this will be to replace the text of "todoTask11()" in the function body
 * with an expression must like the body of the comparator(x Int: y:Int) function you write in task10.
 *
 * @return a List of Int where the list is a pre-specified list of Int's sorted in descending order.
 */
fun task12(): List<Int> {
    todoTask12()
    return arrayListOf(1, 5, 2)
}

