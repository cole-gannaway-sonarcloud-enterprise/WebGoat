package org.owasp.webgoat.lessons.jwt.votes;


import org.junit.jupiter.api.Test;
import org.owasp.webgoat.lessons.jwt.votes.Views;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ViewsTest {

  @Test
  public void testGuestView() {
    Views.GuestView guestView = new Views.GuestView() {};
    assertNotNull(guestView);
  }

  @Test
  public void testUserView() {
    Views.UserView userView = new Views.UserView() {};
    assertNotNull(userView);
  }
}
