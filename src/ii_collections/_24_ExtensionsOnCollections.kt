package ii_collections

import util.TODO

fun todoTask24() = TODO(
    """
        Task 24.
        The function should behave the same as '_24_JavaCode.doSomethingStrangeWithCollection'
        Replace all invocations of 'todoTask9()' with the appropriate code.
    """,
        references = { c: Collection<String> -> _24_JavaCode().doSomethingStrangeWithCollection(c) }
)

fun doSomethingStrangeWithCollection(collection: Collection<String>): Collection<String>? {
    val groupsByLength = collection. groupBy { s -> todoTask24() }

    val maximumSizeOfGroup = groupsByLength. values(). map { group -> todoTask24() }. max()

    return groupsByLength. values(). firstOrNull { group -> todoTask24() }
}

