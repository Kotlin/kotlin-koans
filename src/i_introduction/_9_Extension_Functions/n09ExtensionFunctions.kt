package i_introduction._9_Extension_Functions

import util.TODO
import util.doc9

// declares an extension function that returns the last character
fun String.lastChar() = this.get(this.length - 1)


// 'this' refers to the receiver (String) and can be omitted
fun String.lastChar1() = get(length - 1)

fun useExtensionFunction() {
    // try Ctrl+Space "default completion" after the dot: lastChar() is visible
    "abc".lastChar()
}

// 'lastChar' is compiled to a static function in the class ExtensionFunctionsKt (see JavaCode9.useExtension)

fun todoTask9(): Nothing = TODO(
    """
        Task 9.
        Implement the extension functions Int.r(), Pair<Int, Int>.r()
        to support the following manner of creating rational numbers:
        1.r(), Pair(1, 2).r()
    """,
    documentation = doc9(),
    references = { 1.r(); Pair(1, 2).r(); RationalNumber(1, 9) })

data class RationalNumber(val numerator: Int, val denominator: Int)

fun Int.r(): RationalNumber = todoTask9()
fun Pair<Int, Int>.r(): RationalNumber = todoTask9()


