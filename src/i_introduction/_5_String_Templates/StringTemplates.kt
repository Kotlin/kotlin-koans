package i_introduction._5_String_Templates

import util.TODO
import util.doc5

fun example1(a: Any, b: Any) =
        "This is some text in which variables ($a, $b) appear."

fun example2(a: Any, b: Any) =
        "You can write it in a Java way as well. Like this: " + a + ", " + b + "!"

fun example3(c: Boolean, x: Int, y: Int) = "Any expression can be used: ${if (c) x else y}"

fun example4() =
        """
You can use raw strings to write multiline text.
There is no escaping here, so raw strings are useful for writing regex patterns,
you don't need to escape a backslash by a backslash.
String template entries (${42}) are allowed here.
"""

fun getPattern() = """\d{2}\.\d{2}\.\d{4}"""

fun example() = "13.06.1992".matches(getPattern().toRegex()) //true

val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun todoTask5(): Nothing = TODO(
    """
        Task 5.
        The goal of this task is to replace the task5() function implementation
        to return a regular expression string that can be used to match dates
        formatted such as '13 JUN 1992' (excluding the quotes).

        The getPattern() function (above) is an example regular expression string
        that nearly solves this task, but not quite.

        The solution of your task should use the provided 'month' variable (above).
    """,
    documentation = doc5(),
    references = { getPattern(); month })

fun task5(): String = todoTask5()
