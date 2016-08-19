package i_introduction._7_Nullable_Types

import util.JavaCode

class JavaCode7 : JavaCode() {
    fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer) {
        if (client == null || message == null) return

        val personalInfo = client.personalInfo ?: return

        val email = personalInfo.email ?: return

        mailer.sendMessage(email, message)
    }
}
