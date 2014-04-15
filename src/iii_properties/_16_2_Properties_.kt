package iii_properties

import util.TODO

class LazyProperty(val initializer: () -> Int) {
    val lazy: Int = todoTask16_2()
}

fun todoTask16_2() = TODO(
    """
        Task16.
        Add a custom getter to make the 'lazy' val really lazy.
        It should be initialized by 'initializer()' invocation
        at the moment of the first access.
        You can add as many additional properties as you need.
        Do not use Delegates ;).
    """,
    references = { LazyProperty({ 42 }).lazy }
)
