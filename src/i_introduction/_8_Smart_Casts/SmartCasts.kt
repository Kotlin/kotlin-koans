package i_introduction._8_Smart_Casts

import util.TODO
import util.doc8

/**
 * Description of task.
 */
fun todoTask8(expr: Expr): Nothing = TODO(
        """
        Task 8

        The goal of this task is to replace both instances of the code "todoTask8(e)"
        within the below function eval(e: Eval) with the appropriate code to perform
        the same logic as found in JavCode8.eval(Expr expr).

        As show in the partial solution below in the eval(e: Eval) function, your
        solution should use the Kotin "when" control structure. Additionally, make sure
        to include an "else" clause.
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
 * MODIFY the function body of this method as described in todoTask8().
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


