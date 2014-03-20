package i_introduction._5_Nullable_Types

import java.io.File
import util.TODO

fun test() {
    val s: String = "this variable cannot store null references"
    val q: String? = null

    fun useNotNullableType(i: Int) {
    }
    //doesn't compile:
    //useNotNullableType(null)
}

fun struggleAgainstNPE() {
    val files = File("test").listFiles()

    //doesn't compile
    //println(files.size)

    fun checkForNull1() {
        if (files != null) {
            files.size
        }
    }

    fun checkForNull2() {
        if (files == null) return
        files.size
    }

    fun checkForNull3() {
        if (files == null) fail()
        files.size
    }

    fun nullAsResultIfNullReference() {
        files?.size
    }

    fun defaultValueForNull() {
        val size = files?.size
        size ?: "no files"
    }

    fun throwNPEIfNull() {
        val f = files!!
        f.size
    }
}

fun fail() = throw Exception()

fun todoTask5(client: Client?, message: String?, mailer: Mailer) = TODO(
        task = """Task5.
            Rewrite JavaCode5.sendMessageToClient to kotlin (using only one 'if').
            Declarations of Client, PersonalInfo and Mailer are below.""",
        references = { JavaCode5().sendMessageToClient(client, message, mailer) }
)

fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
) {
    todoTask5(client, message, mailer)
}

class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)
trait Mailer {
    fun sendMessage(email: String, message: String)
}