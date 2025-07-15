package org.di;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.di.config.AppConfig;
import org.di.service.MessagePrinter;
import org.di.service.MessageService;
import org.di.service.impl.SimpleMessageService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionTest {

  @BeforeAll
  public static void setup() {
    // set System Property to ignore class format issues
    System.setProperty("spring.classformat.ignore", "true");
  }

  @Test
  public void testDependencyInjection() {
    // Create Spring Context
    try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
        AppConfig.class)) {
      // Print bean names for debugging
      System.out.println("[DEBUG LOG] -> Available beans:");
      for (String beanName : context.getBeanDefinitionNames()) {
        System.out.println("[DEBUG LOG] -> " + beanName);
      }

      // Get beans from context by type
      MessageService messageService = context.getBean(MessageService.class);
      MessagePrinter messagePrinter = context.getBean(MessagePrinter.class);

      // Verify beans are not null
      assertNotNull(messageService, "MessageService is null");
      assertNotNull(messagePrinter, "MessagePrinter is null");

      // Verify messageService is an instance of SimpleMessageService
      assertInstanceOf(SimpleMessageService.class, messageService,
          "MessageService is not a SimpleMessageService");

      // Verify the message content
      assertEquals("Hi from SimpleMessageService", messageService.getMessage()
          , "Message content should match!");
    }
  }
}
