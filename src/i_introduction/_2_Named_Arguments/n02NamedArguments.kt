package i_introduction._2_Named_Arguments

import i_introduction._1_Java_To_Kotlin_Converter.task1
import util.TODO
import util.doc2

// default values for arguments
fun bar(i: Int, s: String = "", b: Boolean = true) {}

fun usage() {
    // named arguments
    bar(1, b = false)
}

fun task2(collection: Collection<Int>): String {
    return collection.joinToString(prefix = "{", postfix = "}")
}