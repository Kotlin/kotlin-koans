package i_introduction._1_Functions

import util.TODO

fun todoTask1(collection: Collection<Int>) = TODO(
    """
        Task 1.
        Rewrite JavaCode1.task1 in Kotlin.
        In IntelliJ, you can just copy-paste the code and agree to automatically convert it to Kotlin,
        but only for this task!
    """,
    references = { JavaCode1().task1(collection) })


fun task1(collection: Collection<Int>): String {
    todoTask1(collection)
}
