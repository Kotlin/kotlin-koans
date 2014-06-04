package iv_builders.builders

import java.util.HashMap
import util.TODO
import iv_builders.htmlLibrary.html
import com.google.common.collect.Multimap
import com.google.common.collect.HashMultimap
import java.util.ArrayList
import iv_builders.htmlLibrary.*
import iv_builders.data.getProducts
import util.questions.Answer
import util.questions.Answer.*

fun todoTask26() = TODO(
    """
        Task 26.
        Look at the questions below and give your answers:
        change 'insertAnswerHere()' in task26's map to your choice (a, b or c).

        All the constants are imported by 'util.questions.Answer.*', so they can be accessed by name.

    """
)

fun insertAnswerHere() = todoTask26()

fun task26() = linkedMapOf<Int, Answer>(
/*
1. In the Kotlin code
        tr {
            td {
                text("Product")
            }
            td {
                text("Popularity")
            }
        }
'td' is:
    a. special built-in syntactic construct
    b. function declaration
    c. function invocation
 */
        1 to c,

/*
2. In the Kotlin code
            tr (color = "yellow") {
                td {
                    text("Product")
                }
                td {
                    text("Popularity")
                }
            }
'color' is:
  a. new variable declaration
  b. argument name
  c. argument value
 */
        2 to b,

/*
3. The block
                 {
                     text("Product")
                 }
from the previous question is:
  a. block inside built-in syntax construction 'td'
  b. function literal (or "lambda")
  c. something mysterious

 */
        3 to b,

/*
4. For the code
            tr (color = "yellow") {
                this.td {
                    text("Product")
                }
                td {
                    text("Popularity")
                }
            }
which of the following is true:
  a. this code doesn't compile
  b. 'this' refers to an instance of an outer class
  c. 'this' refers to a receiver parameter TR of the function literal:
            tr (color = "yellow") { TR.(): Unit ->
                  this.td {
                      text("Product")
                  }
            }
 */
        4 to c
)