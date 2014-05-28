package i_introduction._3_Lambdas

import util.TODO
import com.google.common.collect.Iterables

fun examples() {

    val sum = { x: Int, y: Int -> x + y }

    val three = sum(1, 2)

    fun apply(i: Int, f: (Int) -> Unit) = f(i)

    apply(2, { x -> x + 25 })
    //you can omit round brackets if lambda is the last argument
    apply(2) { x -> x + 25 }

    fun applyToStrangeArguments(f: (Int, Int) -> Int) = f(938, 241)

    applyToStrangeArguments(sum)

    applyToStrangeArguments({ x, y -> x + y })

    applyToStrangeArguments() { x, y -> x + y }

    applyToStrangeArguments { x, y -> x + y }
}

fun todoTask3(collection: Collection<Int>) = TODO(
    """
        Task 3.
        Rewrite 'JavaCode3.task3()' to Kotlin using lambdas.
        Please find the appropriate function on collection through completion.
        (Don't use the class 'Iterables').
    """,
    references = { JavaCode3().task3(collection) })

fun task3(collection: Collection<Int>): Boolean = collection.any { x -> x % 42 == 0 }



