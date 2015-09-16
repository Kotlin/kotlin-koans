package syntax.casts

fun foo(a: Any?) {
    if (a is String) {
        val s = a
    }

    if (a !is Int) return
    // smart casted:
    a + 2
}

fun safeCastOperator(a: Any) {
    val i: Int? = a as? Int
}

