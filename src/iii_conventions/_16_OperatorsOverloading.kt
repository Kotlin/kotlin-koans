package iii_conventions

import util.TODO
import iii_conventions.TimeInterval.*

fun infixNotation() {
    fun Int.foo(s: String) = "$s$this"

    1.foo("abc")
    1 foo "abc"
}

//Only predefined operators can be overloaded by the corresponding names
//The whole list of operators can be found in syntax.OperatorOverloading
trait A {
    fun plus(a: A): A
    fun minus(a: A): A
    fun not(): A
}

fun use(a1: A, a2: A) {
    a1 + a2
    a1 - a2
    !a1
}

fun todoTask16() = TODO(
        task = """Task13.
        Implement a kind of date arithmetic, let to add years, weeks and days to a date.
        Use classes MyDate and TimeInterval. Add all the changes to the file MyDate.kt.
        Use an util function MyDate.addTimeIntervals.
        Uncomment the commented line and make it compiled.
        You may need to add an extra class here.""",
        references = {(date: MyDate, timeInterval: TimeInterval) -> date.addTimeIntervals(timeInterval, 1) })

fun task16(today: MyDate): MyDate {
    todoTask16()
//    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}

