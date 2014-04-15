package iv_builders

import java.util.HashMap
import util.TODO

// function
fun getLastChar(s: String) = s.charAt(s.length - 1)

// extension function
// 'this' can be omitted
fun String.lastChar() = charAt(length - 1)


fun functionLiterals() {
    // function literal
    val f = { (s: String) -> s.lastChar() }
    f("abc")

    // extension function literal
    // 'this' can be omitted
    val g = { String.() -> lastChar() }
    "abc".g()
}

fun todoTask19_1() = TODO(
        task = "Task19.1. Impelement extension function literals that are stored in 'isEven' and 'isOdd' variables."
)

fun task19_1(): List<Boolean> {
    val isEven: Int.() -> Boolean = { todoTask19_1() }
    val isOdd: Int.() -> Boolean = { todoTask19_1() }

    return listOf(42.isOdd(), 239.isOdd(), 294823098.isEven())
}



