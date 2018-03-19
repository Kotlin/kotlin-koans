package iii_conventions

import iii_conventions.TimeInterval.*
import java.util.*

fun MyDate.nextDay() = addTimeIntervals(DAY, 1)

fun MyDate.addTimeIntervals(timeInterval: TimeInterval, number: Int) = Calendar.getInstance().run {
    set(year, month, dayOfMonth)
    add(when (timeInterval) {
        TimeInterval.DAY -> Calendar.DAY_OF_MONTH
        TimeInterval.WEEK -> Calendar.WEEK_OF_MONTH
        TimeInterval.YEAR -> Calendar.YEAR
    }, number)
    MyDate(get(Calendar.YEAR), get(Calendar.MONTH), get(Calendar.DATE))
}