package iii_conventions

import util.TODO

fun compareStrings(s1: String?, s2: String?) {
    s1 == s2
    // generates to
    s1?.equals(s2) ?: s2.identityEquals(null)
}

trait B {
    fun compareTo(other: B): Int
}

fun test(b1: B, b2: B) {
    b1 < b2
    //generates to
    b1.compareTo(b2) < 0

    b1 >= b2
    //generates to
    b1.compareTo(b2) >= 0
}

fun todoTask13() = TODO(
        task = """Task13.
        Uncomment the commented line to make it compile. Add all changes to the file Date.kt.
        Make class Date implement Comparable.""",
        references = { (date: Date) -> }
)

fun task13(date1: Date, date2: Date): Boolean {
    todoTask13()
//    return date1 < date2
}

