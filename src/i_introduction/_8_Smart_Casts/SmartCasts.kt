package i_introduction._8_Smart_Casts

import util.TODO
import util.doc8

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int =
        when (e) {
            is Num -> e.value
            is Sum -> eval(e.left) + eval(e.right)
            else -> throw IllegalArgumentException("Unknown expression")
        }

fun todoTask8(expr: Expr): Nothing = TODO(
    """
        Task 8.
        Rewrite 'JavaCode8.eval()' in Kotlin using smart casts and 'when' expression.
    """,
    documentation = doc8(),
    references = { JavaCode8().eval(expr) })

