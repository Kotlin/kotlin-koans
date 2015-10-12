package ii_conventions

import util.*
import ii_conventions.TimeInterval.*

fun todoTask15() = TODO(
    """
        Task 15.
        Implement a kind of date arithmetic. Support adding years, weeks and days to a date.
        Use classes MyDate and TimeInterval.
        Use a utility function MyDate.addTimeIntervals.
        Uncomment the commented line and make it compile.

        (1). Add an extension function 'plus()' to MyDate, taking a TimeInterval as an argument.
        (2). Support adding several time intervals to a date. Add an extra class.
        If you have any problems, see the ii_conventions/_15_Tips.kt file.
    """,
    references = { date: MyDate, timeInterval: TimeInterval ->
        date.addTimeIntervals(timeInterval, 1)
    })

fun task15_1(today: MyDate): MyDate {
    todoTask15()
//    return today + YEAR + WEEK
}

fun task15_2(today: MyDate): MyDate {
    todoTask15()
//    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}

