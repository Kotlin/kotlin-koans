package i_introduction._2_Default_And_Named_Params

import util.TODO
import i_introduction._1_Functions.task1

fun bar(i: Int, s: String? = null, b: Boolean = true) {}

fun usage() {
    bar(1, b = false)
}

fun todoTask2(name: String) = TODO(
        task = "Task2(1). Rewrite JavaCode2.foo to kotlin.",
        references = { JavaCode2().foo(name) })

fun foo(name: String): String = todoTask2(name)

fun testFoo() = TODO("${foo("")}! Uncomment the following code.")
//    ( foo("a")
//    + foo("b", 1)
//    + foo("c", toUpperCase = true)
//    + foo(name = "d", number = 2, toUpperCase = true))

fun task2(collection: Collection<Int>): String = TODO(
        task = """Task2(2).
        Implement the same logic as in task1 again through the library method "makeString".
        Change values of some arguments of "makeString".""",
        references = { task1(collection); collection.makeString() })
