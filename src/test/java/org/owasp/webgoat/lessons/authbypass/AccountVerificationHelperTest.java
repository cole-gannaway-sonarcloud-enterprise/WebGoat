package org.owasp.webgoat.lessons.authbypass;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class AccountVerificationHelperTest {

    @Test
    public void verifyAccountHappyPathTest() {
        AccountVerificationHelper helper = new AccountVerificationHelper();
        HashMap<String, String> submittedQuestions = new HashMap<>();
        submittedQuestions.put("secQuestion0", "Dr. Watson");
        submittedQuestions.put("secQuestion1", "Baker Street");
        Assertions.assertTrue(helper.verifyAccount(1223445, submittedQuestions));
    }

    @Test
    public void verifyAccountMissingQuestionTest() {
        AccountVerificationHelper helper = new AccountVerificationHelper();
        HashMap<String, String> submittedQuestions = new HashMap<>();
        submittedQuestions.put("secQuestion0", "Dr. Watson");
        Assertions.assertFalse(helper.verifyAccount(1223445, submittedQuestions));
    }

    @Test
    public void verifyAccountIncorrectAnswerTest() {
        AccountVerificationHelper helper = new AccountVerificationHelper();
        HashMap<String, String> submittedQuestions = new HashMap<>();
        submittedQuestions.put("secQuestion0", "Dr. Strange");
        submittedQuestions.put("secQuestion1", "Baker Street");
        Assertions.assertFalse(helper.verifyAccount(1223445, submittedQuestions));
    }
}
