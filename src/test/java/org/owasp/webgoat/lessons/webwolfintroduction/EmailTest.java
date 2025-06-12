package org.owasp.webgoat.lessons.webwolfintroduction;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.owasp.webgoat.lessons.webwolfintroduction.Email;

public class EmailTest {

    @Test
    public void testBuilder() {
        Email email = Email.builder()
                .contents("Test contents")
                .sender("Test sender")
                .title("Test title")
                .recipient("Test recipient")
                .build();

        Assertions.assertEquals("Test contents", email.getContents());
        Assertions.assertEquals("Test sender", email.getSender());
        Assertions.assertEquals("Test title", email.getTitle());
        Assertions.assertEquals("Test recipient", email.getRecipient());
    }

    @Test
    public void testBuilderWithNullValues() {
        Email email = Email.builder().build();

        Assertions.assertNull(email.getContents());
        Assertions.assertNull(email.getSender());
        Assertions.assertNull(email.getTitle());
        Assertions.assertNull(email.getRecipient());
    }
}
