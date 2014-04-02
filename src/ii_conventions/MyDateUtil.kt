package ii_conventions

import java.util.Calendar
import ii_conventions.TimeInterval.YEAR
import ii_conventions.TimeInterval.DAY
import ii_conventions.TimeInterval.WEEK

fun MyDate.nextDay() = addTimeIntervals(DAY, 1)

fun MyDate.addTimeIntervals(timeInterval: TimeInterval, number: Int): MyDate {
    val c = Calendar.getInstance()
    c.set(year + if (timeInterval == YEAR) number else 0, month, dayOfMonth)
    var timeInMillis = c.getTimeInMillis()
    val millisecondsInADay = 24 * 60 * 60 * 1000L
    timeInMillis += number * when (timeInterval) {
        DAY -> millisecondsInADay
        WEEK -> 7 * millisecondsInADay
        YEAR -> 0L
    }
    val result = Calendar.getInstance()
    result.setTimeInMillis(timeInMillis)
    return MyDate(result.get(Calendar.YEAR), result.get(Calendar.MONTH), result.get(Calendar.DATE))
}