package i_introduction._5_String_Templates

import java.util.regex.Pattern
import util.*

fun getPattern() = """(\w*) (\w*) \((\d{2})\.(\d{2})\.(\d{4})\)"""

fun example() = Pattern.compile(getPattern()).matcher("Douglas Adams (11.03.1952)").find()

val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun todoTask4(): Nothing = TODO(
    """
        Task 4.
        Copy the body of 'getPattern()' to the 'task4()' function
        and rewrite it in such a way that it matches 'Douglas Adams (11 MAR 1952)'.
        Use the 'month' variable.
    """,
    documentation = doc4(),
    references = { getPattern(); month })

fun task4(): String = todoTask4()
