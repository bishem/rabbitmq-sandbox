package fr.smile.sandbox.amqppublisher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AmqpPublisherApplication {

  public static void main(final String[] args) {
    SpringApplication.run(AmqpPublisherApplication.class, args);
  }
}
