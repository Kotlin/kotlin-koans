package ii_collections

import util.TODO

/**
 * Description of task.
 */
fun todoTask24(): Nothing = TODO(
        """
        Task 24

        The function should behave the same as 'JavaCode24.doSomethingStrangeWithCollection'
        Replace all invocations of 'todoTask24()' with the appropriate code.
        """,
        references = { c: Collection<String> -> JavaCode24().doSomethingStrangeWithCollection(c) }
)

fun doSomethingStrangeWithCollection(collection: Collection<String>): Collection<String>? {
    val groupsByLength = collection.groupBy { s -> todoTask24() }

    return groupsByLength.values.maxBy { group -> todoTask24() }
}

