package util

suppress("UNUSED_PARAMETER")
fun TODO(task: String, vararg references: Any?) = throw NotImplementedException("TODO: $task")

class NotImplementedException(message: String): Exception(message)