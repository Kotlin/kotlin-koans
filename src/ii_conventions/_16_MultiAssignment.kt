package ii_conventions.multiAssignemnt

import util.*

fun todoTask16() = TODO(
    """
        Task 16.
        Read about multi-declarations and make the following code compile by adding one word (after uncommenting it).
    """,
    documentation = doc16()
)

class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

fun isLeapDay(date: MyDate): Boolean {
    todoTask16()
//    val (year, month, dayOfMonth) = date
//
//    // 29 February of a leap year
//    return year % 4 == 0 && month == 2 && dayOfMonth == 29
}