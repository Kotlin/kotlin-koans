package util

@Suppress("UNUSED_PARAMETER")
fun TODO(task: String, documentation: Unit = Unit, vararg references: Any?): Nothing = throw NotImplementedException(task)

class NotImplementedException(message: String): Exception(message)