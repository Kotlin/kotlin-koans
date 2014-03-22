package iii_conventions

import java.util.Calendar
import iii_conventions.TimeInterval.YEAR
import iii_conventions.TimeInterval.DAY
import iii_conventions.TimeInterval.WEEK

fun Date.addTimeIntervals(timeInterval: TimeInterval, number: Int): Date {
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
    return Date(result.get(Calendar.YEAR), result.get(Calendar.MONTH), result.get(Calendar.DATE))
}