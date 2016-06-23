package i_introduction._1_Java_To_Kotlin_Converter

import util.TODO

/**
 * Description of task.
 */
fun todoTask1(collection: Collection<Int>): Nothing = TODO(
        """
        Task 1

        The logic for this task exists in java class JavaCode1, which is in this same folder.
        The goal of this task is to replace the body of task1(collection) with the logic
        found in JavaCode1.task1(collection), but you need to re-write the logic in Kotlin.

        Note: If you copy the JavaCode1.task1(collection) logic and paste it into this
        file's task1(collection) function, IntelliJ will offer to automatically convert
        the code from Java to Kotlin for you. Give the automatic conversion a try!
        In the future, you will want to reject the automatic conversion and manually
        translate the code from Java to Kotlin so you don't cheat yourself out of
        the learning opportunity.
        """,
        references = { JavaCode1().task1(collection) })


/**
 * Modify the function body of this method as described in todoTask1().
 *
 * @param collection a collection of Int
 * @return If the incoming collection is [1, 12, 3] the output should be "{1, 12, 3}".
 */
fun task1(collection: Collection<Int>): String {
    todoTask1(collection)
}
