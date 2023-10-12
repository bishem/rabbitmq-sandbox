package fr.smile.sandbox.amqppublisher.service;

import fr.smile.sandbox.amqppublisher.domain.Message;

public interface MessagingService {

  void send(final Message message);
}
