package org.owasp.webgoat.container.lessons;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.owasp.webgoat.container.lessons.LessonInfoModel;

public class LessonInfoModelTest {

    @Test
    public void testConstructor() {
        LessonInfoModel model = new LessonInfoModel("Lesson Title", true, false, true);
        Assertions.assertEquals("Lesson Title", model.getLessonTitle());
        Assertions.assertTrue(model.isHasSource());
        Assertions.assertFalse(model.isHasSolution());
        Assertions.assertTrue(model.isHasPlan());
    }

    @Test
    public void testDefaultValues() {
        LessonInfoModel model = new LessonInfoModel("Lesson Title", false, false, false);
        Assertions.assertEquals("Lesson Title", model.getLessonTitle());
        Assertions.assertFalse(model.isHasSource());
        Assertions.assertFalse(model.isHasSolution());
        Assertions.assertFalse(model.isHasPlan());
    }
}
