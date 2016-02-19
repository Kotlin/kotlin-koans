package i_introduction._8_Smart_Casts

import util.TODO
import util.doc8

fun todoTask8(expr: Expr): Nothing = TODO(
        """
        Task 8

        Rewrite 'JavaCode8.eval()' in Kotlin using smart casts and 'when' expression.
        """,
        documentation = doc8(),
        references = { JavaCode8().eval(expr) })

/**
 * An interface for defining pieces of an expression.
 */
interface Expr

/**
 * A number literal expression.
 */
class Num(val value: Int) : Expr

/**
 * A sum expression, which represents the sum of the two specified Expr expression elements.
 */
class Sum(val left: Expr, val right: Expr) : Expr

/**
 * Replace the function body of this method as described in todoTask8().
 *
 * @param e a Expr object (such as a Num or Sum object)
 * @return the solution to the expression e
 */
fun eval(e: Expr): Int =
        when (e) {
            is Num -> todoTask8(e)
            is Sum -> todoTask8(e)
            else -> throw IllegalArgumentException("Unknown expression")
        }


