package iii_conventions

import util.TODO
import util.doc28

fun iterateOverCollection(collection: Collection<Int>) {
    for (element in collection) {}
}

fun iterateOverString() {
    // You can iterate over anything that has an 'iterator' method, member or extension.
    for (c in "abcd") {}
    "abcd".iterator() //library extension method
}

fun iterateOverRange() {
    for (i in 1..10) {}
    for (c in 'a'..'z') {}
}

fun todoTask28(): Nothing = TODO(
    """
        Task 28.
        Uncomment the commented code and make it compile.
        Add all changes to the file MyDate.kt.
        Make class DateRange implement Iterable<MyDate>.
        Use object expression to implement Iterator<MyDate>.
        Use the utility function 'MyDate.nextDay()'.
    """,
    documentation = doc28(),
    references = { date: MyDate -> DateRange(date, date.nextDay()) })


fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
//    todoTask28()
    for (date in firstDate..secondDate) {
        handler(date)
    }
}
