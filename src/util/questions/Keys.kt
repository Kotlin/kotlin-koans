package util.questions

import util.questions.Answer.*

object Keys {
    private val map = mapOf(
            "Builders" to listOf(c, b, b, c)
    )
    fun get(name: String, index: Int) = map[name]!![index]
}