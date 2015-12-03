package i_introduction._7_Nullable_Types;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import util.JavaCode;

public class JavaCode7 extends JavaCode {
    public void sendMessageToClient(@Nullable Client client, @Nullable String message, @NotNull Mailer mailer) {
        if (client == null || message == null) return;

        PersonalInfo personalInfo = client.getPersonalInfo();
        if (personalInfo == null) return;

        String email = personalInfo.getEmail();
        if (email == null) return;

        mailer.sendMessage(email, message);
    }
}
