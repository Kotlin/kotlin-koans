package iv_builders

import util.*

fun todoTask22() = TODO(
    """
        Task 22.
        Read about extension function literals.
        You can declare `isEven` and `isOdd` as values, that can be called as extension functions.
        Complete the declarations below.
    """,
    documentation = doc22()
)

fun task22(): List<Boolean> {
    val isEven: Int.() -> Boolean = { todoTask22() }
    val isOdd: Int.() -> Boolean = { todoTask22() }

    return listOf(42.isOdd(), 239.isOdd(), 294823098.isEven())
}



