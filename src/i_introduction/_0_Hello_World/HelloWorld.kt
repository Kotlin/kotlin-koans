package i_introduction._0_Hello_World.Hello

import util.TODO
import util.doc0

/**
 * Description of task.
 */
fun todoTask0(): Nothing = TODO(
    """

        Task 0

        Introduction

        The Kotlin Koans Workshop aims to teach you Kotlin by writing code
        to solve tasks. For each task, there is an associated unit test that
        checks your solution. You can run all of the tests (check all of the work
        so far) by executing the "All tests" target.

        Individual workshop tasks (this one, task0, is the first of many) generally
        require you to change the function 'taskN' by completely replacing the body
        of the function in order to solve the problem and allow the associated unit
        test to pass. If you run the unit test for a task that is not correct, the
        unit test results will be displayed. If you have not yet made any changes
        to a task, the task's TODO message will be displayed and exception will be
        thrown. This message will provide guidance on the task to be performed.

        In this example (this file), this means replacing the code below

            fun task0(): String {
                return todoTask0()
            }

        with the correct, meaningful code in order to solve the problem and allow the associated
        unit test to pass, such as:

            fun task0(): String {
                return "OK"
            }

        Using 'documentation' argument you can open the related part of Kotlin online documentation.
        Press 'F1' (Quick Documentation) on 'doc0()', "See also" section gives you a link.

        Using 'references' you can usually navigate and see the code mentioned in the task description.

        To start please make the function 'task0' return "OK".
    """,
    documentation = doc0(),
    references = { task0(); "OK" }
)

/**
 * Replace the function body of this method as described in todoTask0().
 *
 * @return the string literal "OK".
 */
fun task0(): String {
    return todoTask0()
}


