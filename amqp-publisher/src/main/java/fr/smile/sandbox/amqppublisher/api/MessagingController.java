package fr.smile.sandbox.amqppublisher.api;

import org.springframework.web.bind.annotation.RestController;

import fr.smile.sandbox.amqppublisher.domain.Message;
import fr.smile.sandbox.amqppublisher.service.MessagingService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MessagingController implements MessagingApi {

  private final MessagingService service;

  @Override
  public void send(final Message message) {
    service.send(message);
  }
}
