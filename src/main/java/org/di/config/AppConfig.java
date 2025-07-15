package org.di.config;

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

  }

}
