package ii_conventions

import util.TODO
import ii_conventions.TimeInterval.*

fun infixNotation() {
    fun Int.foo(s: String) = "$s$this"

    1.foo("abc")
    1 foo "abc"
}

//Only predefined operators can be overloaded by the corresponding names
//A complete list of operators can be found in syntax/OperatorOverloading.kt
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
        Implement a kind of date arithmetic, support adding years, weeks and days to a date.
        Use classes MyDate and TimeInterval.
        Use a utility function MyDate.addTimeIntervals.
        Uncomment the commented line and make it compile.
        In a task 13_2 you may need to add an extra class (or use Pair).""",
        references = { (date: MyDate, timeInterval: TimeInterval, syntax: syntax.operatorOverloading.B) ->
            date.addTimeIntervals(timeInterval, 1)
        })

fun task13_1(today: MyDate): MyDate {
    todoTask13()
//    return today + YEAR + WEEK
}

fun task13_2(today: MyDate): MyDate {
    todoTask13()
//    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}

