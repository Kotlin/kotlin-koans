package i_introduction._1_Functions

import util.TODO

fun foo(s: String): String {
    fun localFoo(): Int {
        return 42
    }
    return s + localFoo()
}

//If a function returns a simple expression, you can use "=" and omit the return type.
fun bar() = 43

//For public functions the return type can't be omitted and should be specified explicitly.
public fun pbar(): Int = 45

//The default visibility is 'internal' meaning "visible inside a module".
internal fun ibar() = 57

fun todoTask1(collection: Collection<Int>) = TODO(
    """
        Task 1.
        Rewrite JavaCode1.task1 to Kotlin.
        You can just copy-paste it and agree to automatically convert it to Kotlin - but only in this task :).
    """,
    references = { JavaCode1().task1(collection) })


public fun task1(collection: Collection<Int>): String {
    val sb = StringBuilder()
    sb.append("{")
    val iterator = collection.iterator()
    while (iterator.hasNext()) {
        val element = iterator.next()
        sb.append(element)
        if (iterator.hasNext()) {
            sb.append(", ")
        }
    }
    sb.append("}")
    return sb.toString()
}
