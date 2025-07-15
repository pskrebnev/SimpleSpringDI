package org.di;

import org.di.config.AppConfig;
import org.di.service.MessagePrinter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Main class that demonstrates Spring Dependency Injection
 */
public class Main {

  public static void main(String[] args) {
    // Spring app context
    try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
        AppConfig.class)) {
      System.out.println("Spring context initialized successfully!");

      // Get the 'MessagePrinter' bean from the context
      MessagePrinter messagePrinter = context.getBean(MessagePrinter.class);

      // Use the bean to print a message
      System.out.println("Calling MessagePrinter.printMessage():");
      messagePrinter.printMessage();

      // The 'MessageService' dependency was automatically injected by Spring
      System.out.println("\n -> Dependency Injection works successfully!");
    }
  }
}
