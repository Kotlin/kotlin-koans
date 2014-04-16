package iv_builders

import java.util.HashMap
import util.TODO

fun functions() {
    // function
    fun getLastChar(s: String) = s.charAt(s.length - 1)
    getLastChar("abc")

    // extension function
    fun String.lastChar() = this.charAt(this.length - 1)
    // 'this' can be omitted
    fun String.lastChar2() = charAt(length - 1)
    "abc".lastChar()
}


fun functionLiterals() {
    // function literal
    val getLastChar = { (s: String) -> s.charAt(s.length - 1) }
    getLastChar("abc")

    // extension function literal
    val lastChar = { String.() -> this.charAt(this.length - 1) }
    // 'this' can be omitted
    val lastChar2 = { String.() -> charAt(length - 1) }
    "abc".lastChar()
}

fun todoTask19_1() = TODO(
    """
        Task19.1.
        Replace 'todoTask19_1()' so that 'x.isEven()' checks that x is even
        and 'x.isOdd()' checks that x is odd.
    """
)

fun task19_1(): List<Boolean> {
    val isEven: Int.() -> Boolean = { todoTask19_1() }
    val isOdd: Int.() -> Boolean = { todoTask19_1() }

    return listOf(42.isOdd(), 239.isOdd(), 294823098.isEven())
}



