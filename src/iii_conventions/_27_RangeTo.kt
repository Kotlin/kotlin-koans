package iii_conventions

import util.TODO
import util.doc26

fun todoTask27(): Nothing = TODO(
    """
        Task 27.
        Uncomment the commented code and make it compile.
        To make '..' work implement a 'MyDate.rangeTo()' extension function returning DateRange.
        Add all changes to the file MyDate.kt.
    """,
    documentation = doc26()
)

fun checkInRange2(date: MyDate, first: MyDate, last: MyDate): Boolean {
    todoTask27()
//    return date in first..last
}
