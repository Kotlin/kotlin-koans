package i_introduction._4_Lambdas

import util.TODO
import util.doc4

fun example() {
    val sum = { x: Int, y: Int -> x + y }
    val square: (Int) -> Int = { x -> x * x }

    sum(1, square(2)) == 5
}

/**
 * Description of task.
 */
fun todoTask4(collection: Collection<Int>): Nothing = TODO(
        """
        Task 4

        Replace the implementation of task4(collection) to provide the same logic as
        found in JavaCode4.task4(collection). Your Kotlin solution should use
        lambdas.

        You can find the appropriate function to call on 'collection' through
        IntelliJ's code completion feature. (Don't use the class 'Iterables').
        """,
        documentation = doc4(),
        references = { JavaCode4().task4(collection) })

/**
 * Replace the function body of this method as described in todoTask4().
 *
 * @param input a collection of Int's
 * @return true of any of the elements of collection are divisible by 42
 */
fun task4(collection: Collection<Int>): Boolean = todoTask4(collection)




