package i_introduction._9_Extension_Functions

import util.TODO
import util.doc9

// 'lastChar' is compiled to a static function in the class ExtensionFunctionsKt (see JavaCode9.useExtension)
fun String.lastChar() = this.get(this.length - 1)

// 'this' can be omitted
fun String.lastChar1() = get(length - 1)

fun use() {
    // try Ctrl+Space "default completion" after the dot: lastChar() is visible
    "abc".lastChar()
}

/**
 * Description of task.
 */
fun todoTask9(): Nothing = TODO(
        """
        Task 9

        The goal of this task is to implement the extension functions Int.r(), Pair<Int, Int>.r()
        to support the following manner of creating rational numbers: 1.r(), Pair(1, 2).r().
        If a denominator is not provided (as in the case of Int.r()), use a denominator of 1.
        """,
        documentation = doc9(),
        references = { 1.r(); Pair(1, 2).r(); RationalNumber(1, 9) })

/**
 * A class defining a RationalNumber. Given that this class is a "data" class,
 * .toString(), .equals(), and .hashcode() will be created automatically for this class.
 */
data class RationalNumber(val numerator: Int, val denominator: Int)

/**
 * Replace the function body of this method as described in todoTask9().
 *
 * Extend the class Int to add a function r() which returns a RationalNumber
 * with the numerator having the Int's value and a denominator being 1.
 *
 * @return the solution to the expression e
 */
fun Int.r(): RationalNumber = todoTask9()

/**
 * Replace the function body of this method as described in todoTask9().
 *
 * Extend the class Pair of Int, int to add a function r() which returns a RationalNumber
 * setting the numerator to the Pair's .first value and setting the denominator
 * to the Pair's .second value.
 *
 * @return the solution to the expression e
 */
fun Pair<Int, Int>.r(): RationalNumber = todoTask9()
