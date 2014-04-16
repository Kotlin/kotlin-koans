package syntax.lambdas

fun fullSyntacticFormOfFunctionLiterals() {
    val sum1 = { (x: Int, y: Int): Int -> x + y }

    // function type
    val sum2: (Int, Int) -> Int = { x, y -> x + y }

    // one parameter is by default named 'it'
    val oneParameter: (Int) -> Int = { it }

    val extensionLambda = { Int.(x: Int) -> this + x }
    1.extensionLambda(2) // == 3
}

fun closure(): Int {
    var counter = 0
    fun increment() {
        counter++
    }
    for (i in 1..10) {
        increment()
    }
    return counter
}