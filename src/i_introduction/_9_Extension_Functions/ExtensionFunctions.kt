package i_introduction._9_Extension_Functions

import util.*

fun todoTask8() = TODO(
    """
        Task 8.
        Implement the extension functions Int.r(), Pair<Int, Int>.r()
        to support the following manner of creating rational numbers:
        1.r(), Pair(1, 2).r()
    """,
    documentation = doc8(),
    references = { 1.r(); Pair(1, 2).r(); RationalNumber(1, 9) })

data class RationalNumber(val numerator: Int, val denominator: Int)

fun Int.r(): RationalNumber = todoTask8()
fun Pair<Int, Int>.r(): RationalNumber = todoTask8()


