package org.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Component that uses the 'MessageService'
 * to demonstrate Dependency Injection
 */
@Component
public class MessagePrinter {
  private final MessageService messageService;

  /**
   * Constructor Injection of the 'MessageService'
   * @param 'messageService'
   */
  @Autowired
  public MessagePrinter(MessageService messageService) {
    this.messageService = messageService;
  }
}
