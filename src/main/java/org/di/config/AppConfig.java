package org.di.config;

import org.di.service.MessageService;
import org.di.service.impl.SimpleMessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Spring config to define beans explicitly
 */
@Configuration
public class AppConfig {

  /**
   * The Message bean
   */
  @Bean
  public MessageService messageService() {
    return new SimpleMessageService();
  }

  /**
   * MessagePrinter bean with Injected MessageService
   */
  @Bean
  public MessagePrinter simpleMessageService() {
    return new SimpleMessageService();
  }

}
