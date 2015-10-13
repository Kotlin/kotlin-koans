package iii_conventions

import util.*

fun todoTask26() = TODO(
    """
        Task 26.
        Uncomment the commented code and make it compile.
        Add all changes to the file MyDate.kt.
        Make class DateRange implement Iterable<MyDate>.
        Use object expression to implement Iterator<MyDate>.
        Use the utility function 'MyDate.nextDay()'.
    """,
    documentation = doc26(),
    references = { date: MyDate -> DateRange(date, date.nextDay()) })


fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    todoTask26()
//    for (date in DateRange(firstDate, secondDate)) {
//        handler(date)
//    }
}
