package ii_conventions

import util.TODO

fun iterateOverRange() {
    //'..' resolves to 'rangeTo' function
    val intRange = 1..10
    for (i in intRange) {}
    for (i in 1..10) {}
    for (c in 'a'..'z') {}
}

fun todoTask11_2() = TODO(
        task = """Task11(2).
        Uncomment the commented code and make it compile.
        To make '..' work add 'MyDate.rangeTo' extension function returning DateRange.""",
        references = { (date: MyDate) -> date.nextDay() })


fun iterateOverDateRange2(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    todoTask11_2()
//    for (date in firstDate..secondDate) {
//        handler(date)
//    }
}
