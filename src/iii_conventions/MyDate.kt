package iii_conventions

data class MyDate(
        val year: Int,
        val month: Int,
        val dayOfMonth: Int
)

enum class TimeInterval {
    DAY
    WEEK
    YEAR
}