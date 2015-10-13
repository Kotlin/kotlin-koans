package i_introduction._4_Lambdas

import util.*

fun todoTask3(collection: Collection<Int>): Nothing = TODO(
    """
        Task 3.
        Rewrite 'JavaCode3.task3()' in Kotlin using lambdas.
        You can find the appropriate function to call on 'collection' through IntelliJ's code completion feature.
        (Don't use the class 'Iterables').
    """,
    documentation = doc3(),
    references = { JavaCode3().task3(collection) })

fun task3(collection: Collection<Int>): Boolean = todoTask3(collection)




