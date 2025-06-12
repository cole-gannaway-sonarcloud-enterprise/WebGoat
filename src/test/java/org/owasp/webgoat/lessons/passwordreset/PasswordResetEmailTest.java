package org.owasp.webgoat.lessons.passwordreset;


import org.junit.jupiter.api.Test;
import org.owasp.webgoat.lessons.passwordreset.PasswordResetEmail;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordResetEmailTest {

    @Test
    public void testCreateEmail() {
        LocalDateTime time = LocalDateTime.now();
        String contents = "Test contents";
        String sender = "Test sender";
        String title = "Test title";
        String recipient = "Test recipient";

        PasswordResetEmail email = PasswordResetEmail.builder()
                .time(time)
                .contents(contents)
                .sender(sender)
                .title(title)
                .recipient(recipient)
                .build();

        assertEquals(time, email.getTime());
        assertEquals(contents, email.getContents());
        assertEquals(sender, email.getSender());
        assertEquals(title, email.getTitle());
        assertEquals(recipient, email.getRecipient());
    }
}
