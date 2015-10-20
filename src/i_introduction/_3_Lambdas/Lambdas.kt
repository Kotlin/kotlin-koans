package i_introduction._3_Lambdas

import util.TODO
import com.google.common.collect.Iterables

fun examples() {

    val sum = { x: Int, y: Int -> x + y }

    val three = sum(1, 2)

    fun apply(i: Int, f: (Int) -> Unit) = f(i)

    apply(2, { x -> x + 25 })
    // You can omit wrapping parentheses if a lambda is the last argument to a function call
    apply(2) { x -> x + 25 }

    fun applyToStrangeArguments(f: (Int, Int) -> Int) = f(938, 241)

    applyToStrangeArguments(sum)

    applyToStrangeArguments({ x, y -> x + y })

    applyToStrangeArguments() { x, y -> x + y }

    applyToStrangeArguments { x, y -> x + y }
}

fun todoTask3(collection: Collection<Int>): Nothing = TODO(
    """
        Task 3.
        Rewrite 'JavaCode3.task3()' in Kotlin using lambdas.
        You can find the appropriate function to call on 'collection' through IntelliJ's code completion feature.
        (Don't use the class 'Iterables').
    """,
    references = { JavaCode3().task3(collection) })

fun task3(collection: Collection<Int>): Boolean = todoTask3(collection)




