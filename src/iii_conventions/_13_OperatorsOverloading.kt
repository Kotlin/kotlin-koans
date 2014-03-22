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

fun todoTask13() = TODO(
        task = """Task13.
        Implement a kind of date arithmetic, let to add years, weeks and days to a date.
        Use classes Date and TimeInterval. Add all the changes to the file Date.kt.
        Use an util function Date.addTimeIntervals.
        Uncomment the commented line and make it compiled.""",
        references = {(date: Date, timeInterval: TimeInterval) -> date.addTimeIntervals(timeInterval, 1) })

fun task13(today: Date): Date {
    todoTask13()
//    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}

