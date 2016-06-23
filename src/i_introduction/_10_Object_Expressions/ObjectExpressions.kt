package i_introduction._10_Object_Expressions

import util.TODO
import util.doc10
import java.util.*

/**
 * Description of task.
 */
fun todoTask10(): Nothing = TODO(
        """
        Task 10

        Object expressions that play the same role in Kotlin as anonymous classes do in Java.

        The goal of this task is to sort the List of Int using an object expression that
        provides a comparator to sort a list of Int in a descending order using java.util.Collections
        class.

        In Kotlin you use Kotlin library extensions instead of java.util.Collections, but this example
        is still a good demonstration of mixing Kotlin and Java code.
        """,
        documentation = doc10()
)

/**
 * MODIFY the function body of this method as described in todoTask10().
 * The ideal solution to this will be to replace the text of "todoTask10()" in the function body
 * with an inline object expression that creates a "Comparator of Int" object that overrides the
 * compare(l: Int, r: Int) function to provide a descending sort.
 *
 * @return a List of Int where the list is a pre-specified list of Int's sorted in descending order.
 */
fun task10(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, todoTask10())
    return arrayList
}