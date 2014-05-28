package ii_conventions

import util.TODO

fun multiAssignPair(pair: Pair<Int, String>) {
    val (first, second) = pair
}

class MyPair {
    fun component1(): Int = 1
    fun component2(): String = "a"
}

fun howItWorks() {
    fun invocation() {
        val (i, s) = MyPair()
    }
    //invocations of functions 'component1' and 'component2' are generated
    fun generatedCode() {
        val tmp = MyPair()
        val i = tmp.component1()
        val s = tmp.component2()
    }
}

fun iterateOverCollectionWithIndex(collection: Collection<Int>) {
    for ((index, element) in collection.withIndex()) {
        println("$index: $element")
    }
}

fun howWorksMultiAssignmentInForCycle() {
    fun invocation(it: Iterator<MyPair>) {
        for ((i, s) in it) {
        }
    }

    fun generatedCode(it: Iterator<MyPair>) {
        for (tmp in it) {
            val i = tmp.component1()
            val s = tmp.component2()
        }
    }
}

// with 'data' annotation 'component1', 'component2', etc. are generated automatically
// for constructor parameters
data class MyAnotherPair(val i: Int, val s: String)

//that's why we can multi-assign Date class:
fun multiAssignDate(date: MyDate) {
    val (year, month, dayOfMonth) = date
}

fun todoTask16() = TODO("Again no special task. Just return 'true' if you are interested in Kotlin. =)")

fun task16(): Boolean = true