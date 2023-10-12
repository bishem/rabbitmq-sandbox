package fr.smile.sandbox.amqppublisher.api;

import org.springdoc.core.annotations.ParameterObject;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import fr.smile.sandbox.amqppublisher.domain.Message;

public interface MessagingApi {

  @GetMapping("/send")
  @ResponseStatus(HttpStatus.ACCEPTED)
  void send(@ParameterObject Message message);
}
