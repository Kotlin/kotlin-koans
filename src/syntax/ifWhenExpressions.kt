package syntax.ifWhenExpressions

fun ifExpression(a: Int, b: Int) {
    val max1 = if (a > b) a else b

    val max2 = if (a > b) {
        println("Choose a")
        a
    }
    else {
        println("Choose b")
        b
    }
}

fun whenExpression(a: Any?) {
    val result = when (a) {
        null -> "null"
        is String -> "String"
        is Any -> "Any"
        else -> "Don't know"
    }
}

fun whenExpression(x: Int) {
    when (x) {
        0, 11 -> "0 or 11"
        in 1..10 -> "from 1 to 10"
        !in 12..14 -> "not from 12 to 14"
        else -> "otherwise"
    }
}

fun whenWithoutArgument(x: Int) {
    when {
        x == 42 -> "x is 42"
        x % 2 == 1 -> "x is odd"
        else -> "otherwise"
    }
}

