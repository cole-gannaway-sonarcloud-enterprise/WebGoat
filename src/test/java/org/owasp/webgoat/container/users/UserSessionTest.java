package org.owasp.webgoat.container.users;


import org.junit.jupiter.api.Test;
import org.owasp.webgoat.container.users.UserSession;
import org.owasp.webgoat.container.users.WebGoatUser;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserSessionTest {

  @Test
  public void constructorTest() {
    WebGoatUser webGoatUser = new WebGoatUser("testUser", "testPassword");
    String sessionId = "testSessionId";
    UserSession userSession = new UserSession(webGoatUser, sessionId);

    assertEquals(webGoatUser, userSession.getWebGoatUser());
    assertEquals(sessionId, userSession.getSessionId());
  }
}
