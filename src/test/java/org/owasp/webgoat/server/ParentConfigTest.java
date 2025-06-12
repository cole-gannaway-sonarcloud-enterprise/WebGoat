package org.owasp.webgoat.server;


import org.junit.jupiter.api.Test;
import org.owasp.webgoat.server.ParentConfig;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ParentConfigTest {

    @Test
    public void testConfiguration() {
        ParentConfig config = new ParentConfig();
        assertNotNull(config);
    }
}
