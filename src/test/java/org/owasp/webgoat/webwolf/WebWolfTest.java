package org.owasp.webgoat.webwolf;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.owasp.webgoat.webwolf.WebWolf;
import org.springframework.boot.actuate.web.exchanges.HttpExchangeRepository;

public class WebWolfTest {

  @Test
  public void testTraceRepositoryCreation() {
    WebWolf webWolf = new WebWolf();
    HttpExchangeRepository traceRepository = webWolf.traceRepository();
    Assertions.assertNotNull(traceRepository);
  }
}
