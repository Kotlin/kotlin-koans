package i_introduction._4_String_Templates

import java.util.regex.Pattern
import util.TODO

fun foo1(a: Any, b: Any) =
        "There is a text in which some variables ($a, $b) appear."

fun foo2(a: Any, b: Any) =
        "You can write it in a Java way as well. Like this: " + a + ", " + b + "!"

fun foo3(c: Boolean, x: Int, y: Int) = "Any expression can be used: ${if (c) x else y}"

fun foo4() =
"""
Triple quotes are used
to contain raw strings.
"""

fun getPatternInAUsualString() = "(\\w)* (\\w)* \\((\\d{2})\\.(\\d{2})\\.(\\d{4})\\)"

fun getPatternInARawString() = """(\w*) (\w*) \((\d{2})\.(\d{2})\.(\d{4})\)"""

fun example() = Pattern.compile(getPatternInARawString()).matcher("Douglas Adams (11.03.1952)").find()

val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun todoTask4() = TODO(
        task = """Task4.
        Rewrite 'getPatternInARawString' the way it matches 'Douglas Adams (11 MAR 1952)'.
        Use 'month' variable.""",
        references = { getPatternInARawString(); month })

fun task4(): String = todoTask4()
