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

fun todoTask7(client: Client?, message: String?, mailer: Mailer): Nothing = TODO(
    """
        Task 7.
        Rewrite JavaCode7.sendMessageToClient in Kotlin, using only one 'if' expression.
        Declarations of Client, PersonalInfo and Mailer are given below.
    """,
    documentation = doc7(),
    references = { JavaCode7().sendMessageToClient(client, message, mailer) }
)

fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
) {
    todoTask7(client, message, mailer)
}

class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)

interface Mailer {
    fun sendMessage(email: String, message: String)
}
