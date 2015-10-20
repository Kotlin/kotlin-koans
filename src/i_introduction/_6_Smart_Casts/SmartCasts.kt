package i_introduction._6_Smart_Casts

import util.TODO

abstract class Expr
class Num(val value: Int) : Expr()
class Sum(val left: Expr, val right: Expr) : Expr()

fun eval(e: Expr): Int {
    if (e is Num) {
        val n = e
        return n.value
    }
    if (e is Sum) {
        // Actually, there is no need for a separate variable:
        return eval(e.left) + eval(e.right)
    }
    throw IllegalArgumentException("Unknown expression")
}

fun evalWhen(e: Expr): Int =
        when (e) {
            is Num -> e.value
            is Sum -> evalWhen(e.left) + evalWhen(e.right)
            else -> throw IllegalArgumentException("Unknown expression")
        }

fun todoTask6(expr: Expr): Nothing = TODO(
    """
        Task 6.
        Rewrite 'JavaCode6.print()' in Kotlin using a 'when' expression.
        Other examples of 'when' syntax can be found in the syntax/ifWhenExpressions.kt file.
    """,
    references = { JavaCode6().print(expr); syntax.ifWhenExpressions.whenWithoutArgument(42) })

fun print(expr: Expr): String = todoTask6(expr)

