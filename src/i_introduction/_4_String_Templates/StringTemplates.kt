package i_introduction._4_String_Templates

import java.util.regex.Pattern
import util.TODO

fun example1(a: Any, b: Any) =
        "There is a text in which some variables ($a, $b) appear."

fun example2(a: Any, b: Any) =
        "You can write it in a Java way as well. Like this: " + a + ", " + b + "!"

fun example3(c: Boolean, x: Int, y: Int) = "Any expression can be used: ${if (c) x else y}"

fun example4() =
"""
You can use triple-quoted strings to write multiline text.
There is no escaping here, so it can be useful for writing patterns as well.
String template entries (${42}) are allowed here.
"""

fun getPatternInAUsualString() = "(\\w)* (\\w)* \\((\\d{2})\\.(\\d{2})\\.(\\d{4})\\)"

fun getPatternInTQString() = """(\w*) (\w*) \((\d{2})\.(\d{2})\.(\d{4})\)"""

fun example() = Pattern.compile(getPatternInTQString()).matcher("Douglas Adams (11.03.1952)").find()

val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun todoTask4() = TODO(
    """
        Task 4.
        Copy the body of 'getPatternInTQString()' to 'task4()' function
        and rewrite it in such a way that it matches 'Douglas Adams (11 MAR 1952)'.
        Use the 'month' variable.
    """,
    references = { getPatternInTQString(); month })

fun task4(): String = """(\w*) (\w*) \((\d{2}) $month (\d{4})\)"""
