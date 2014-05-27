package v_advanced.generics

import util.questions.doQuestionnaire
import util.questions.Question
import util.questions.Answer
import util.questions.Answer.*
import util.TODO

// Generics are NOT reified (they're erased as in Java).

fun <T> bar(c: Collection<T>) {
// That means you can't check 'is' for generic type:
//    if (c is List<Int>) { }

// However, if the compiler can guarantee the parameter type, the check is allowed:
    if (c is List<T>) {}

// List<*> means 'List of elements of unknown type', the same as List<?> in Java:
    if (c is List<*>) {}
}

fun <E> enclose(list: MutableList<E>) {
    val head = list.head
    if (head != null) {
        list.add(head)
    }
}

fun encloseV2(list: MutableList<*>) {
    val head = list.head
    if (head != null) {
        // doesn't compile
        // for now 'add' is unresolved, but diagnostic has to be improved
//        c.add(head)
    }
}

fun todoTask29() = TODO(
        """
        Task 29.
        Run 'Generics Questions' configuration (or 'main' function declared below) and answer the questions.
    """
)

fun main(args: Array<String>) {
    doQuestionnaire(
            "Generics",
            Question(
                    """
                        The function
                            fun isListOfNumbers(c: List<*>) = c is List<Int>
                        doesn't compile because
                    """,
                    a to "Generic types are reified",
                    b to "Generic types are erased",
                    c to "List<*> can neber be a list of ints"
            ),

            Question(
                    """
                        Note: You can use an action "Show expression type" or
                        invoke "Specify type explicitly" intention on a declared variable
                        to see a type of expression / variable.

                        The type of the variable 'head' in the following function
                            fun encloseV2(list: MutableList<*>) {
                                val head = list.head
                            }
                        is
                    """,
                    a to "'Any?'",
                    b to "'*'",
                    c to "unknown"
            ),

            Question(
                    """
                        The code
                            fun encloseV2(list: MutableList<*>) {
                                val head = list.head
                                if (head != null) {
                                    c.add(head)
                                }
                            }
                        doesn't compile because
                    """,
                    a to "There is no method 'add' on MutableList",
                    b to "We can't invoke any methods on MutableList<*>",
                    c to "Type of element is MutableList<*> is unknown, \n" +
                            "so the compiler can't allow to add an element of 'Any' type to the list"
            )
    )
}