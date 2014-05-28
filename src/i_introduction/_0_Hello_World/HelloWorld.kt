package i_introduction._0_Hello_World.Hello

import util.TODO

//compiles to a static function in a class HelloPackage
fun main(args: Array<String>) {
    println("Hello, world!")
}

fun todoTask0() = TODO(
    """
        Introduction.
        The task in the workshop is usually to change the function 'taskN' by replacing its body,
        the function invocation 'todoTaskN()', with the corresponding code according to the problem.
        The function 'todoTaskN()' throws an exception, so you usually have to replace its invocation with meaningful code.

        There are usually explanations of the Kotlin features to use in the same file as the task.
        Please read them, we prepared them carefully for you =).

        Using references you can usually navigate and see the code mentioned in the task description.

        To start please make the function 'task0' returns "OK" =).
    """,
    references = { task0(); "OK" }
)

fun task0(): String {
    return "OK"
}


