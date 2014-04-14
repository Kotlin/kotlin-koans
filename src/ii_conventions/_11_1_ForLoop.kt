package ii_conventions

import util.TODO

fun iterateOverCollection(collection: Collection<Int>) {
    for (element in collection) {}
}

fun iterateOverString() {
    //You can iterate over anything that has a method 'iterator', member or extension.
    for (c in "abcd") {}
    "abcd".iterator() //library extension method
}

fun todoTask11() = TODO(
        task = """Task11.
        Uncomment the commented code and make it compile.
        Add all changes to the file MyDate.kt.
        Make class DateRange implement Iterable<MyDate>.
        Add a new class DateIterator (implementing Iterator<MyDate>).
        Use an utility function MyDate.nextDay.""",
        references = { (date: MyDate) -> DateRange(date, date.nextDay()) })


fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    todoTask11()
//    for (date in DateRange(firstDate, secondDate)) {
//        handler(date)
//    }
}