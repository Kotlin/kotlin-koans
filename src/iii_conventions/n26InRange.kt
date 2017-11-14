package iii_conventions

import util.TODO
import util.doc26

fun todoTask26_(): Nothing = TODO(
    """
        Task 26.
        Uncomment the commented line and make it compile.
        Make all the changes to the file MyDate.kt.

        Tips: In Kotlin 'in' checks are translated to the corresponding 'contains' calls.
        You can add a method 'fun contains(d: MyDate)' to the class 'DateRange' to allow 'in' checks with a range of dates.
        Alternatively, you can make the class 'DateRange' implement the 'ClosedRange' interface from the standard library.
    """,
    documentation = doc26(),
    references = { range: ClosedRange<Int> -> }
)

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in DateRange(first, last)
}
