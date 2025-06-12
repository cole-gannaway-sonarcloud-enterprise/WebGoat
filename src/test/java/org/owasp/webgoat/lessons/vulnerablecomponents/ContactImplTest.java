
package org.owasp.webgoat.lessons.vulnerablecomponents;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactImplTest {

    @Test
    public void testContactImpl() {
        ContactImpl contact = new ContactImpl();
        contact.setFirstName("John");
        contact.setLastName("Doe");
        contact.setEmail("john@doe.com");

        Assertions.assertEquals("John", contact.getFirstName());
        Assertions.assertEquals("Doe", contact.getLastName());
        Assertions.assertEquals("john@doe.com", contact.getEmail());
    }
}
