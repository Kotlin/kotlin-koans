package iii_conventions

import util.TODO
import util.doc26

fun todoTask26_(): Nothing = TODO(
    """
        Task 26.
        Uncomment the commented line.
        In Kotlin 'in' checks are translated to the corresponding 'contains' calls.
        Add a method 'fun contains(d: MyDate)' to the class 'DateRange' to allow 'in' checks with a range of dates.
        Alternatively, you can make the class DateRange implement the standard ClosedRange interface.
        Add all changes to the file MyDate.kt.
    """,
    documentation = doc26(),
    references = { range: ClosedRange<Int> -> }
)

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    todoTask26_()
//    return date in DateRange(first, last)
}
