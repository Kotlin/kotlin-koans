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
        Uncomment the commented line and make it compile. Add all changes to the file MyDate.kt.
        Make class DateRange implement kotlin.Range<MyDate>.
    """,
    references = { (range: Range<Int>) -> }
)

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    todoTask14()
//    return date in first..last
}