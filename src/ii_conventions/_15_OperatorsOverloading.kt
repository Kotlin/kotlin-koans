package ii_conventions

import util.TODO
import ii_conventions.TimeInterval.*

fun infixNotation() {
    fun Int.foo(s: String) = "$s$this"

    1 foo "abc"
    // the same as:
    1.foo("abc")
}

//Only predefined operators can be overloaded by the corresponding names
//A complete list of operators can be found in syntax/OperatorOverloading.kt
trait A {
    fun plus(a: A): A
    fun times(a: A): A
    fun not(): A
}

fun use(a1: A, a2: A) {
    a1 + a2
    a1 * a2
    !a1
}

fun todoTask15() = TODO(
    """
        Task 15.
        Implement a kind of date arithmetic, support adding years, weeks and days to a date.
        Use classes MyDate and TimeInterval.
        Use a utility function MyDate.addTimeIntervals.
        Uncomment the commented line and make it compile.

        (1). Add an extension function 'plus()' to MyDate, taking TimeInterval as an argument.
        (2). Support adding several time intervals to a date. Add an extra class.
        If any problems, see ii_conventions/_15_Tips.kt.
    """,
    references = { date: MyDate, timeInterval: TimeInterval ->
        date.addTimeIntervals(timeInterval, 1)
    })

fun task15_1(today: MyDate): MyDate {
//    todoTask15()
    return today + YEAR + WEEK
}

fun task15_2(today: MyDate): MyDate {
//    todoTask15()
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}

