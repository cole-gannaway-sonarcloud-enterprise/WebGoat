package org.owasp.webgoat.container.asciidoc;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.owasp.webgoat.container.asciidoc.WebWolfRootMacro;

import java.util.HashMap;
import java.util.Map;

public class WebWolfRootMacroTest {

    @Test
    public void testConstructorWithMapConfig() {
        Map<String, Object> config = new HashMap<>();
        WebWolfRootMacro macro = new WebWolfRootMacro("webWolfRootMacro", config);
        Assertions.assertNotNull(macro);
    }

    @Test
    public void testConstructorWithNullConfig() {
        WebWolfRootMacro macro = new WebWolfRootMacro("webWolfRootMacro", null);
        Assertions.assertNotNull(macro);
    }
}
