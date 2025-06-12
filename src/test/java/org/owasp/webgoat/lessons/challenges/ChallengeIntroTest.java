
package org.owasp.webgoat.lessons.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.owasp.webgoat.container.lessons.Category;

public class ChallengeIntroTest {

    @Test
    public void getDefaultCategoryTest() {
        ChallengeIntro challengeIntro = new ChallengeIntro();
        Assertions.assertEquals(Category.CHALLENGE, challengeIntro.getDefaultCategory());
    }

    @Test
    public void getTitleTest() {
        ChallengeIntro challengeIntro = new ChallengeIntro();
        Assertions.assertEquals("challenge0.title", challengeIntro.getTitle());
    }
}
