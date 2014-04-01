package iii_conventions

import util.TODO

fun iterateOverCollection(collection: Collection<Int>) {
    for (element in collection) {}

    //with index
    for ((index, element) in collection.withIndices()) {}
}

//You can iterate over anything that has a method 'iterator', member or extension.
fun iterateOverString() {
    for (c in "abcd") {}
    "abcd".iterator() //library extension method
}

fun iterateOverRange() {
    //'..' resolves to 'rangeTo' function
    val intRange = 1..10
    for (i in intRange) {}
    for (i in 1..10) {}
    for (c in 'a'..'z') {}
}

fun todoTask14() = TODO(
        task = """Task15.
        Uncomment the commented code and make it compile. Add all changes to the file MyDate.kt.
        Add a class DateRange and make it implement Iterable<MyDate>.
        Use an util function MyDate.nextDay.""",
        references = { (date: MyDate) -> date.nextDay() })


fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    todoTask14()
//    for (date in firstDate..secondDate) {
//        handler(date)
//    }
}