package i_introduction._4_Lambdas

import util.TODO
import util.doc4

fun example() {

    val sum = { x: Int, y: Int -> x + y }
    val square: (Int) -> Int = { x -> x * x }

    sum(1, square(2)) == 5
}

fun todoTask4(collection: Collection<Int>): Nothing = TODO(
    """
        Task 4.
        Rewrite 'JavaCode4.task4()' in Kotlin using lambdas:
        return true if the collection contains an even number.
        You can find the appropriate function to call on 'Collection' by using code completion.
        Don't use the class 'Iterables'.
    """,
    documentation = doc4(),
    references = { JavaCode4().task4(collection) })

fun task4(collection: Collection<Int>): Boolean = collection.any { it % 2 == 0 }