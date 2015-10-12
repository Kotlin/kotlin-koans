package ii_conventions

import util.*


class Invokable

fun todoTask17(): Nothing = TODO(
    """
        Task 17.
        Change class Invokable to count the number of invocations (round brackets).
        Uncomment the commented code - it should return 4.
    """,
    references = { invokable: Invokable -> })

fun task17(invokable: Invokable): Int {
    todoTask17()
//    return invokable()()()().getNumberOfInvocations()
}
