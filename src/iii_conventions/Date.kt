package iii_conventions

data class Date(
        val year: Int,
        val month: Int,
        val dayOfMonth: Int
)

enum class TimeInterval {
    DAY
    WEEK
    YEAR
}