package iii_properties

import util.*

class LazyPropertyUsingDelegates(val initializer: () -> Int) {
    val lazy: Int by todoTask20()
}

fun todoTask20(): Lazy<Int> = TODO(
    """
        Task 20.
        Read about delegated properties and make the property lazy by using delegates.
    """,
    documentation = doc20()
)
