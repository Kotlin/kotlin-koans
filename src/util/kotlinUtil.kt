package util

suppress("UNUSED_PARAMETER")
fun TODO(task: String, vararg references: Any?) = throw NotImplementedException("TODO: $task")

class NotImplementedException(val message: String): Exception(message)