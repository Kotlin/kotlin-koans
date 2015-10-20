package iv_builders

import java.util.HashMap
import util.TODO

fun functions() {
    // function
    fun getLastChar(s: String) = s[s.length - 1]
    getLastChar("abc")

    // extension function
    fun String.lastChar() = this[this.length - 1]
    // 'this' can be omitted
    fun String.lastChar2() = this[length - 1]
    "abc".lastChar()
}


fun functionLiterals() {
    // function literal
    val getLastChar: (String) -> Char = { s -> s[s.length - 1] }
    getLastChar("abc")

    // extension function literal
    val lastChar: String.() -> Char = { this[this.length - 1] }
    // 'this' can be omitted
    val lastChar2: String.() -> Char = { this[length - 1] }
    "abc".lastChar()
}

fun todoTask22(): Nothing = TODO(
    """
        Task 22.
        Rewrite 'todoTask22()' so that 'x.isEven()' checks that x is even
        and 'x.isOdd()' checks that x is odd.
    """
)

fun task22(): List<Boolean> {
    val isEven: Int.() -> Boolean = { todoTask22() }
    val isOdd: Int.() -> Boolean = { todoTask22() }

    return listOf(42.isOdd(), 239.isOdd(), 294823098.isEven())
}



