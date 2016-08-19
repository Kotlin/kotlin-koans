package i_introduction._10_Object_Expressions

import util.TODO
import util.doc10
import java.util.*

fun todoTask10(): Nothing = TODO(
    """
        Task 10.
        Read about object expressions that play the same role in Kotlin as anonymous classes do in Java.

        Add an object expression that provides a comparator to sort a list in a descending order using java.util.Collections class.
        In Kotlin you use Kotlin library extensions instead of java.util.Collections,
        but this example is still a good demonstration of mixing Kotlin and Java code.
    """,
    documentation = doc10()
)

fun task10(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, object: Comparator<Int> {
        override fun compare(p0: Int?, p1: Int?): Int {
            if ((p0 ?: 0) > (p1 ?: 0)) {
                return -1
            }
            else {
                return 0
            }
        }
    })
    return arrayList
}