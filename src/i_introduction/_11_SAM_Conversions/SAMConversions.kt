package i_introduction._11_SAM_Conversions

import util.TODO
import util.doc11
import java.util.*

/**
 * Description of task.
 */
fun todoTask11(): Nothing = TODO(
        """
        Task 11

        A Java class is considered to implement the SAM (Single Abstract Method) interface when it provides
        a single worker method (you can ignore methods like toString(), equals(), hashCode()). Looking
        at Java's Collection interface

        https://docs.oracle.com/javase/7/docs/api/java/util/Comparator.html

        We see that Comparator<T> (ignoring the equals() method) only requires implementation
        a of single methodL: compare(T, T). Although compare(T, T) isn't Abstract (for that
        matter Comparator is an Interface, not an abstract class), none the less, Comparator<T>
        is still consdered to be a SAM.

        When the parameter to a function is of a type that implements the SAM pattern,
        you can replace that parameter with a simple lamba that contains the correct number
        of arguments.

        Read more about SAM conversions in the blog posts about Kotlin.

        The goal of this task is to rewrite the previous example changing an object expression
        to a single lambda. The bulk of the code is already in place, just replace, within
        task11(), the text "todoTask11()" with the appropriate expression or logic.
        """,
        documentation = doc11()
)

/**
 * MODIFY the function body of this method as described in todoTask11().
 * The ideal solution to this will be to replace the text of "todoTask11()" in the function body
 * with an expression like that found in the body of the comparator(x Int: y:Int) { } function
 * you wrote in task10.
 *
 * @return a List of Int where the list is a pre-specified list of Int's sorted in descending order.
 */
fun task11(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, { l, r -> todoTask11() })
    return arrayList
}
