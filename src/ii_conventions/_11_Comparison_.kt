package ii_conventions

import util.*

fun todoTask11(): Nothing = TODO(
    """
        Task 11.
        Uncomment the commented line and make it compile. 
        Add all changes to the file MyDate.kt.
        Make class MyDate implement Comparable.
    """,
    documentation = doc11(),
    references = { date: MyDate, comparable: Comparable<MyDate> -> }
)

fun task11(date1: MyDate, date2: MyDate): Boolean {
    todoTask11()
//    return date1 < date2
}

