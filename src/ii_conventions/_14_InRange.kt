package ii_conventions

import util.TODO

trait Container<E> {
    fun contains(element: E): Boolean
}

fun inConvention(container: Container<String>) {
    "a" in container
    // compiles to
    container.contains("a")
}

fun numericalRange(i: Int, c: Char) {
    //'..' resolves to 'rangeTo' function
    if (i in 1..10) {}

    if (c in 'a'..'z') {}
}

fun stringRange(s: String) {
    if (s in "island".."isle") {}
}

fun todoTask14() = TODO(
    """
        Task 14.
        Uncomment the commented line.
        For now being in interval is checked with the function 'fun <T> Iterable<T>.contains(T): Boolean'
        which is not optimal (you can check the boundaries instead of iterating over the whole range).
        Make class DateRange implement kotlin.Range<MyDate>.
        Add all changes to the file MyDate.kt.
    """,
    references = { range: Range<Int> -> }
)

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
//    todoTask14()
    return date in first..last
}