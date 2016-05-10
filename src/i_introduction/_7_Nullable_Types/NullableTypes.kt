package i_introduction._7_Nullable_Types

import util.TODO
import util.doc7

fun test() {
    val s: String = "this variable cannot store null references"
    val q: String? = null

    if (q != null) q.length      // you have to check to dereference
    val i: Int? = q?.length      // null
    val j: Int = q?.length ?: 0  // 0
}

/**
 * Description of task.
 */
fun todoTask7(client: Client?, message: String?, mailer: Mailer): Nothing = TODO(
        """
        Task 7

        The goal of this task is to introduce you to Nullable Types, which Kotin decorates
        with the "?" symbol to the right of (but connected to) the type. For example
        the type "Int" must contain a valid Int value (such as 15), but the type
        "Int?" may contain a normal Int value OR it might be null

        When a val (value) or var (variable) is of a nullable type, before obtaining the
        value of that value or variable, Kotlin forces you to verify that the value is not null.

        Replace the body of the below function sendMessageToClient(...) such that
        it uses the same logic found in JavaCode7.sendMessageToClient(...).
        Use only one 'if' expression. Declarations of Client, PersonalInfo and Mailer are given below.

        Make sure you look at the test() function above and understand the functioning of the
        various operators used. Of special interest is the "?:" operator, which is commonly
        referred to as the "Elvis Operator".
        """,
        documentation = doc7(),
        references = { JavaCode7().sendMessageToClient(client, message, mailer) }
)

class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)

interface Mailer {
    fun sendMessage(email: String, message: String)
}

/**
 * Replace the function body of this method as described in todoTask7().
 *
 * @return
 */
fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer) {
    todoTask7(client, message, mailer)
}
