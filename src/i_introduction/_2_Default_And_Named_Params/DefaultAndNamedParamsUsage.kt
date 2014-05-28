package i_introduction._2_Default_And_Named_Params

import util.TODO
import i_introduction._1_Functions.task1

fun todoTask2_2() = TODO(
    """
        Task 2(2).
        Implement the same logic as in 'task1' again through the library method 'joinToString()'.
        Change values of some arguments of 'joinToString'.
    """,
    references = { collection: Collection<Int> -> task1(collection); collection.joinToString() })

fun task2_2(collection: Collection<Int>): String {
//    todoTask2_2()
    return collection.joinToString(prefix = "{", postfix = "}")
}