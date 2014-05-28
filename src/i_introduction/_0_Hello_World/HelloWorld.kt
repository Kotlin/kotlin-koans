package i_introduction._0_Hello_World.Hello

import util.*

fun todoTask0(): Nothing = TODO(
    """
        Introduction:

        Workshop tasks are usually to change the function 'taskN' by replacing its body
        (which starts out as the function invocation 'todoTaskN()'), with the correct code according to the problem.
        The function 'todoTaskN()' throws an exception, so you usually have to replace that invocation with
        meaningful code.

        Using 'documentation' argument you can open the related part of Kotlin online documentation.
        Press 'F1' (Quick Documentation) on 'doc0()', "See also" section gives you a link.

        Using 'references' you can usually navigate and see the code mentioned in the task description.

        To start please make the function 'task0' return "OK".
    """,
    documentation = doc0(),
    references = { task0(); "OK" }
)

fun task0(): String {
    return "OK"
}


