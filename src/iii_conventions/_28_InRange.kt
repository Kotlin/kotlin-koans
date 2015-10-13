package iii_conventions

import util.*

fun todoTask28() = TODO(
    """
        Task 28.
        Uncomment the commented line.
        Right now interval membership is checked with the function 'fun <T> Iterable<T>.contains(T): Boolean'
        which is not optimal (you can check the boundaries instead of iterating over the whole range).
        Make class DateRange implement kotlin.Range<MyDate>.
        Add all changes to the file MyDate.kt.
    """,
    documentation = doc28(),
    references = { range: Range<Int> -> }
)

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    todoTask28()
//    return date in first..last
}
