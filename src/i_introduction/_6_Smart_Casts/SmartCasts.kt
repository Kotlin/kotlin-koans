package i_introduction._6_Smart_Casts

import util.TODO

abstract class Expr
class Num(val value: Int) : Expr()
class Sum(val left: Expr, val right: Expr) : Expr()

fun eval(e: Expr): Int {
    if (e is Num) {
        val n = e as Num
        return n.value
    }
    if (e is Sum) {
        // actually, there is no need in a separate variable:
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

fun todoTask6(expr: Expr) = TODO(
        task = "Task6. Rewrite JavaCode6.print to Kotlin using 'when'.",
        references = { JavaCode6().print(expr) })

fun print(expr: Expr): String = todoTask6(expr)

