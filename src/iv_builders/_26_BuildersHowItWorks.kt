package iv_builders.builders

import util.TODO
import util.questions.Answer.*
import util.questions.doQuestionnaire
import util.questions.Question
import util.questions.removeIndents

fun todoTask26() = TODO(
    """
        Task 26.
        Run 'Builders Questions' configuration (or 'main' function declared below) and answer the questions.
    """
)

fun main(args: Array<String>) {
    doQuestionnaire(
            "Builders",
            Question(
                    """
                        In the Kotlin code
                            tr {
                                td {
                                    text("Product")
                                }
                                td {
                                    text("Popularity")
                                }
                            }
                        'td' is:
                    """,
                    a to "special built-in syntactic construct",
                    b to "function declaration",
                    c to "function invocation"
            ),

            Question(
                    """
                        In the Kotlin code
                                tr (color = "yellow") {
                                    td {
                                        text("Product")
                                    }
                                    td {
                                        text("Popularity")
                                    }
                                }
                        'color' is:
                    """,
                    a to "new variable declaration",
                    b to "argument name",
                    c to "argument value"
            ),


            Question(
                    """
                        In the Kotlin code
                                tr (color = "yellow") {
                                    td {
                                        text("Product")
                                    }
                                    td {
                                        text("Popularity")
                                    }
                                }
                        the block
                                     {
                                         text("Product")
                                     }
                        is:
                    """,
                    a to "block inside built-in syntax construction 'td'",
                    b to "function literal (or \"lambda\")",
                    c to "something mysterious"
            ),

            Question(
                    """
                        For the code
                                tr (color = "yellow") {
                                    this.td {
                                        text("Product")
                                    }
                                    td {
                                        text("Popularity")
                                    }
                                }
                        which of the following is true:
                    """,
                    a to "this code doesn't compile",
                    b to "'this' refers to an instance of an outer class",
                    c to
                            """
                                'this' refers to a receiver parameter TR of the function literal:
                                tr (color = "yellow") { TR.(): Unit ->
                                    this.td {
                                        text("Product")
                                    }
                                }
                            """.removeIndents())
    )
}