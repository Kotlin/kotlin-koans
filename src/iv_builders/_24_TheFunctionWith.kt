package iv_builders.examples

import java.util.HashMap
import util.TODO


fun todoTask24(): Nothing = TODO(
    """
        Task 24.
        The previous examples can be rewritten with the library function 'with' (see examples below).
        Write your own implementation of the function 'with' named 'myWith'.
    """
)

fun <T, R> myWith(receiver: T, f: T.() -> R): R = todoTask24()

fun buildString(): String {
    val stringBuilder = StringBuilder()
    with (stringBuilder) {
        append("Numbers: ")
        for (i in 1..10) {
            append(i)
        }
    }
    return stringBuilder.toString()
}

fun buildMap(): Map<Int, String> {
    val map = HashMap<Int, String>()
    with (map) {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
    return map
}
