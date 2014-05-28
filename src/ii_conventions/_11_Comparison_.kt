package ii_conventions

import util.TODO
import kotlin.jvm.internal.Intrinsics

fun compareStrings(s1: String?, s2: String?) {
    s1 == s2
    // is compiled to
    Intrinsics.areEqual(s1, s2)
}

trait B {
    fun compareTo(other: B): Int
}

fun test(b1: B, b2: B) {
    b1 < b2
    // is compiled to
    b1.compareTo(b2) < 0

    b1 >= b2
    // is compiled to
    b1.compareTo(b2) >= 0
}

fun todoTask11() = TODO(
    """
        Task 11.
        Uncomment the commented line and make it compile. 
        Add all changes to the file MyDate.kt.
        Make class MyDate implement Comparable.
        For syntax details see syntax/classesObjectsTraits.kt.
    """,
    references = { date: MyDate, comparable: Comparable<MyDate>, syntax: syntax.classesObjectsTraits.Successor -> }
)

fun task11(date1: MyDate, date2: MyDate): Boolean {
//    todoTask11()
    return date1 < date2
}

