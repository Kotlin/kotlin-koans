package util.questions

import util.questions.Answer.*

object Keys {
    private val map = mapOf(
            "Builders" to listOf(c, b, b, c),
            "Reflection" to listOf(a, b, b, c, b, c),
            "Generics" to listOf(b, a, c)
    )
    fun get(name: String, index: Int) = map[name]!![index]
}