package fr.smile.sandbox.amqppublisher.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

import fr.smile.sandbox.amqppublisher.domain.Message;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MessagingServiceImpl implements MessagingService {

  private final AmqpTemplate template;

  @Override
  public void send(final Message message) {
    template.convertAndSend(message.getExchange().type(), message.getKey(), message);
  }
}
