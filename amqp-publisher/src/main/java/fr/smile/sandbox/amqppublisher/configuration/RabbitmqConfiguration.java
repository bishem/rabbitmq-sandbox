package fr.smile.sandbox.amqppublisher.configuration;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitmqConfiguration {

  @Value("${spring.rabbitmq.host}")
  private String host;

  @Value("${spring.rabbitmq.username}")
  private String username;

  @Value("${spring.rabbitmq.password}")
  private String password;

  @Bean
  public ConnectionFactory factory() {
    final CachingConnectionFactory factory = new CachingConnectionFactory();
    factory.setHost(host);
    factory.setUsername(username);
    factory.setPassword(password);
    return factory;
  }

  @Bean
  public AmqpTemplate template(ConnectionFactory factory) {
    final RabbitTemplate template = new RabbitTemplate(factory);
    template.setUseDirectReplyToContainer(false);
    return template;
  }
}
