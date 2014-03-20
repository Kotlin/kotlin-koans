package i_introduction._7_Extension_Functions.StringExtensions

import util.TODO


fun String.lastChar() = this.charAt(this.length - 1)

//'this' can be omitted
fun String.lastChar1() = charAt(length - 1)

fun use() {
    // it's visible in completion and can be easily found
    "abc".lastChar()
}

// 'lastChar' compiles to a static function in the class StringExtensionsPackage
// and can be used in Java with String as a first argument (see JavaCode7.useExtension)

fun todoTask7() = TODO(
        """Task7.
        Implement extension functions Int.r, Pair<Int, Int>.r
        to support the following way to create rational numbers:
        1.r(), Pair(1, 2).r()""",
        references = { 1.r(); Pair(1, 2).r(); RationalNumber(1, 9) })

data class RationalNumber(val n: Int, val m: Int)

fun Int.r(): RationalNumber = todoTask7()
fun Pair<Int, Int>.r(): RationalNumber = todoTask7()


