package iii_properties

import util.*

class LazyProperty(val initializer: () -> Int) {
    val lazy: Int = todoTask19()
}

fun todoTask19(): Nothing = TODO(
    """
        Task 19.
        Add a custom getter to make the 'lazy' val really lazy.
        It should be initialized by the invocation of 'initializer()'
        at the moment of the first access.
        You can add as many additional properties as you need.
        Do not use delegated properties!
    """,
    references = { LazyProperty({ 42 }).lazy }
)
