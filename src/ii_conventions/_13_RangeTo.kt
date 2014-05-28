package ii_conventions

import util.TODO

fun iterateOverRange() {
    //'..' resolves to 'rangeTo' function
    val intRange = 1..10
    for (i in intRange) {}
    for (i in 1..10) {}
    for (c in 'a'..'z') {}
}

fun todoTask13() = TODO(
    """
        Task 13.
        Uncomment the commented code and make it compile.
        To make '..' work add 'MyDate.rangeTo()' extension function returning DateRange.
        Add all changes to the file MyDate.kt.
    """,
    references = { date: MyDate -> date.nextDay() })


fun iterateOverDateRange2(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
//    todoTask13()
    for (date in firstDate..secondDate) {
        handler(date)
    }
}
