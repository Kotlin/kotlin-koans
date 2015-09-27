package i_introduction._8_Extension_Functions.StringExtensions

import util.TODO


fun String.lastChar() = this.charAt(this.length() - 1)

//'this' can be omitted
fun String.lastChar1() = charAt(length() - 1)

fun use() {
    // Try IntelliJ's Ctrl+Space "default completion" after the dot: lastChar() will be visible in
    // the completion window and can be easily found
    "abc".lastChar()
}

// 'lastChar' compiles to a static function in the class StringExtensionsPackage
// and can be used in Java with a String as its first argument (see JavaCode8.useExtension)

fun todoTask8() = TODO(
    """
        Task 8.
        Implement the extension functions Int.r(), Pair<Int, Int>.r()
        to support the following manner of creating rational numbers:
        1.r(), Pair(1, 2).r()
    """,
    references = { 1.r(); Pair(1, 2).r(); RationalNumber(1, 9) })

data class RationalNumber(val numerator: Int, val denominator: Int)

fun Int.r(): RationalNumber = todoTask8()
fun Pair<Int, Int>.r(): RationalNumber = todoTask8()


