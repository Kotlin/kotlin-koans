package iv_builders

import java.util.HashMap
import util.TODO

fun functions() {
    // function
    fun getLastChar(s: String) = s.charAt(s.length() - 1)
    getLastChar("abc")

    // extension function
    fun String.lastChar() = this.charAt(this.length() - 1)
    // 'this' can be omitted
    fun String.lastChar2() = charAt(length() - 1)
    "abc".lastChar()
}


fun functionLiterals() {
    // function literal
    val getLastChar: (String) -> Char = { s -> s.charAt(s.length() - 1) }
    getLastChar("abc")

    // extension function literal
    val lastChar: String.() -> Char = { this.charAt(this.length() - 1) }
    // 'this' can be omitted
    val lastChar2: String.() -> Char = { charAt(length() - 1) }
    "abc".lastChar()
}

fun todoTask22() = TODO(
    """
        Task 22.
        Replace 'todoTask22()' so that 'x.isEven()' checks that x is even
        and 'x.isOdd()' checks that x is odd.
    """
)

fun task22(): List<Boolean> {
    val isEven: Int.() -> Boolean = { this % 2 == 0 }
    val isOdd: Int.() -> Boolean = { !isEven() }

    return listOf(42.isOdd(), 239.isOdd(), 294823098.isEven())
}



