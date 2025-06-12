
package org.owasp.webgoat.lessons.xss;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CommentTest {

    @Test
    public void shouldCreateCommentWithAllFieldsSet() {
        Comment comment = new Comment("John Doe", "2023-04-08", "This is a test comment.");
        Assertions.assertEquals("John Doe", comment.getUser());
        Assertions.assertEquals("2023-04-08", comment.getDateTime());
        Assertions.assertEquals("This is a test comment.", comment.getText());
    }

    @Test
    public void shouldCreateCommentWithEmptyFields() {
        Comment comment = new Comment();
        Assertions.assertNull(comment.getUser());
        Assertions.assertNull(comment.getDateTime());
        Assertions.assertNull(comment.getText());
    }
}
