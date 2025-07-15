package org.di;

import org.di.config.AppConfig;
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
    try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
        AppConfig.class)) {
      // Print bean names for debugging
      System.out.println("[DEBUG LOG] -> Available beans:");
      for (String beanName : context.getBeanDefinitionNames()) {
        System.out.println("[DEBUG LOG] -> " + beanName);
      }
    }
  }
}
