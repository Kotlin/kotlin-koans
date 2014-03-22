package iii_conventions

import util.TODO

trait Container<E> {
    fun contains(element: E): Boolean
}

fun inConvention(container: Container<String>) {
    "a" in container
    //translated to
    container.contains("a")
}

fun numericalRange(i: Int) {
    //'..' resolves to 'rangeTo' function
    val intRange = 1..10
    if (i in intRange) {}

    if (i in 1..10) {}
}

fun stringRange(s: String) {
    if (s in "island".."isle") {}
}

fun todoTask14() = TODO("""Task14.
        Uncomment the commented line to make it compile. Add all changes to the file Date.kt.
        Add a class DateRange and make it implement Range<Date>."""
)

fun checkInRange(date: Date, first: Date, last: Date): Boolean {
    todoTask14()
//    return date in first..last
}