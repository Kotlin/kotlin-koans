package iv_builders

import util.TODO
import java.util.HashSet

// Higher-order function

// fun <T:Any, R> T.let(f: (T) -> R): R = f(this)

fun testLet() {

    5.let({ x -> println(x * x) })

    5.let { x ->
        println(x * x)
    }
}

// Extension function as a value

// fun <T, R> with(receiver: T, f: T.() -> R) : R = receiver.f()

fun testWith() {
    val stringBuilder = StringBuilder()
    with(stringBuilder, { this.append("1") })

    with (stringBuilder) {
        append("Numbers: ")
        for (i in 1..10) {
            append(i)
        }
    }
}

fun todoTask19_2() = TODO(
    """
        Task19.2.
        Uncomment the commented code and make it compile.
        Add and implement function buildMap with one parameter (of type extension function) creating a new HashMap,
        building it and returning it as a result.
        Look through syntax/javaCollections to choose the right trait.
    """,
    references = { syntax.javaCollections.useMutableSet(HashSet())}
)

fun task19_2(): Map<Int, String> {
    todoTask19_2()
//    return buildMap {
//        this.put(0, "0")
//        for (i in 1..10) {
//            put(i, "$i")
//        }
//    }
}