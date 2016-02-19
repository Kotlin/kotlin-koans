package i_introduction._5_String_Templates

import util.TODO
import util.doc5

/**
 * Example function that demonstrates simple string interpolation.
 */
fun example1(a: Any, b: Any) =
        "This is some text in which variables ($a, $b) appear."

/**
 * Example function using normal Java string concatenation (not using interpolation).
 */
fun example2(a: Any, b: Any) =
        "You can write it in a Java way as well. Like this: " + a + ", " + b + "!"

/**
 * Example function demonstrates a string interpolation where the interpolation is a expression.
 */
fun example3(c: Boolean, x: Int, y: Int) = "Any expression can be used: ${if (c) x else y}"

/**
 * Example function using raw strings covering multiple lines with embedded string interpolation.
 */
fun example4() =
        """
You can use raw strings to write multiline text.
There is no escaping here, so raw strings are useful for writing regex patterns,
you don't need to escape a backslash by a backslash.
String template entries (${42}) are allowed here.
"""

/**
 * Example function showing raw strings to create a regular expression string.
 */
fun getPattern() = """\d{2}\.\d{2}\.\d{4}"""

/**
 * Example function demonstrating the ability to use the getPattern() matcher to
 * match a date in the getPattern() format.
 */
fun example() = "13.06.1992".matches(getPattern().toRegex()) //true

/**
 * Description of task.
 */
fun todoTask5(): Nothing = TODO(
    """
        Task 5

        The goal of this task is to replace the task5() function implementation
        to return a regular expression string that can be used to match dates
        formatted such as '13 JUN 1992' (excluding the quotes).

        The getPattern() function (above) is an example regular expression string
        that nearly solves this task, but not quite.

        The solution of your task should use the provided 'month' variable (above).
    """,
    documentation = doc5(),
    references = { getPattern(); month })

/**
 * A regular expression string is capable of matching the months in 3 letter uppercase.
 * Use this variable in your task solution.
 */
val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

/**
 * Replace the function body of this method as described in todoTask5().
 *
 * @return A regular expression string to match dates formatted such as '13 JUN 1992'
 */
fun task5(): String = todoTask5()
