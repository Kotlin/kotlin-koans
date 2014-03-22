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
    for (i in 1..10) {}
    for (c in 'a'..'z') {}
}

fun todoTask15() = TODO(
        task = """Task15.
        Uncomment the commented code to make it compile. Add changes to the class DateRange.""")


fun iterateOverDateRange(firstDate: Date, secondDate: Date, handler: (Date) -> Unit) {
    todoTask15()
//    for (date in firstDate..secondDate) {
//        handler(date)
//    }
}