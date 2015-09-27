package syntax.lambdas

fun apply(f: (Int, Int) -> Int) = f(1, 2)

fun fullSyntacticFormOfFunctionLiterals() {

    apply({ x, y -> x + y })

    // function type
    val sum: (Int, Int) -> Int = { x, y -> x + y }
    apply(sum)

    // If you need to specify the return type (and the receiver type for an extension lambda), you can use a function expression
    apply(fun (x: Int, y: Int): Int = x + y)

    val sum1 = fun (x: Int, y: Int): Int { return x + y }
    apply(sum1)

    // If an expression has one parameter, that parameter is by default named 'it'
    val oneParameter: (Int) -> Int = { it }
    oneParameter(1)

    val extensionLambda: Int.(Int) -> Int = { x -> this + x }
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
