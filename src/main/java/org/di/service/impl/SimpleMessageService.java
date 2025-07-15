package org.di.service.impl;

import org.di.service.MessageService;
import org.springframework.stereotype.Service;

/**
 * Simple implementation of the 'MessageService' interface
 */
@Service
public class SimpleMessageService implements MessageService {

  @Override
  public String getMessage() {
    return "Hi from SimpleMessageService";
  }
}
