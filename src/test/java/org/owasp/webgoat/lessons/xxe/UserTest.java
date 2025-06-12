
package org.owasp.webgoat.lessons.xxe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

  @Test
  public void getPasswordTest() {
    User user = new User();
    user.setPassword("password");
    Assertions.assertEquals("password", user.getPassword());
  }

  @Test
  public void setPasswordTest() {
    User user = new User();
    user.setPassword("new password");
    Assertions.assertEquals("new password", user.getPassword());
  }

  @Test
  public void getUsernameTest() {
    User user = new User();
    user.setUsername("username");
    Assertions.assertEquals("username", user.getUsername());
  }

  @Test
  public void setUsernameTest() {
    User user = new User();
    user.setUsername("new username");
    Assertions.assertEquals("new username", user.getUsername());
  }
}
