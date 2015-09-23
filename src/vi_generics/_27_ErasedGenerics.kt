package vi_generics.generics

import util.questions.Answer
import util.questions.Answer.*
import util.TODO

// Generics are NOT reified (they're erased, as in Java).

fun <T> bar(c: Collection<T>) {
// That means you can't make an is-check for a generic type:
//    if (c is List<Int>) { }

// However, if the compiler can guarantee the parameter type, the check is allowed:
    if (c is List<T>) {}

// List<*> means 'List of elements of unknown type', the same as List<?> in Java:
    if (c is List<*>) {}
}

fun <E> enclose(list: MutableList<E>) {
    val head = list.firstOrNull()
    if (head != null) {
        list.add(head)
    }
}

fun encloseV2(list: MutableList<*>) {
    val head = list.firstOrNull()
    if (head != null) {
        // doesn't compile
        // for now 'add' is unresolved, but the diagnostic here has to be improved
//        list.add(head)
    }
}

fun todoTask27() = TODO(
    """
        Task 27.
        Look at the questions below and give your answers:
        change 'insertAnswerHere()' in task27's map to your choice (a, b or c).
    """
)

fun insertAnswerHere() = todoTask27()

fun task27() = linkedMapOf<Int, Answer>(
/*
1. The function
      fun isListOfNumbers(c: List<*>) = c is List<Int>
 doesn't compile because

    a. Generic types are reified
    b. Generic types are erased
    c. List<*> can never be a List of Ints
*/

        1 to insertAnswerHere(),


/*
 Note: You can use the IntelliJ action "Show expression type" on variable initializer or
 invoke the "Specify type explicitly" intention on a declared variable
 to see the type of an expression / variable.

 The type of the variable 'head' in the following function
    fun encloseV2(list: MutableList<*>) {
        val head = list.head
    }
 is
    a. 'Any?'
    b. '*'
    c. unknown
*/
      2 to insertAnswerHere(),
/*
The code
    fun encloseV2(list: MutableList<*>) {
        val head = list.head
        if (head != null) {
            list.add(head)
        }
    }
doesn't compile because
    a. There is no 'add' method on MutableList
    b. We can't invoke any methods on MutableList<*>
    c. The type of an element of MutableList<*> is unknown
    so the compiler can't allow adding an element of type 'Any' to the list
*/
        3 to insertAnswerHere()
)
