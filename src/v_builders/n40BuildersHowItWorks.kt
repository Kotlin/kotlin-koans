package v_builders.builders

import util.questions.Answer
import util.questions.Answer.*

fun todoTask40(): Nothing = TODO(
    """
        Task 40.
        Look at the questions below and give your answers:
        change 'insertAnswerHere()' in task40's map to your choice (a, b or c).

        All the constants are imported via 'util.questions.Answer.*', so they can be accessed by name.

    """
)

fun insertAnswerHere(): Nothing = todoTask40()

fun task40() = linkedMapOf<Int, Answer>(
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
        1 to insertAnswerHere(),

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
        2 to insertAnswerHere(),

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
        3 to insertAnswerHere(),

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
            tr (color = "yellow") {
                  this@tr.td {
                      text("Product")
                  }
            }
 */
        4 to insertAnswerHere()
)
