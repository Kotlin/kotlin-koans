package i_introduction._5_String_Templates

import util.*

// Raw strings are useful for writing regex patterns, you don't need to escape a backslash by a backslash:
fun getPattern() = """\d{2}\.\d{2}\.\d{4}"""

fun example() = "13.06.1992".matches(getPattern().toRegex()) //true

val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun todoTask4(): Nothing = TODO(
    """
        Task 4.
        Copy the body of 'getPattern()' to the 'task4()' function
        and rewrite it in such a way that it matches '13 JUN 1992'.
        Use the 'month' variable.
    """,
    documentation = doc4(),
    references = { getPattern(); month })

fun task4(): String = todoTask4()
