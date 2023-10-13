package fr.smile.sandbox.amqppublisher.domain;

import java.time.ZonedDateTime;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Message {

  @Default
  @JsonIgnore
  private UUID id = UUID.randomUUID();

  @Default
  private Exchange exchange = Exchange.DEFAULT;

  private String key;
  private String author;
  private String content;

  @Default
  @JsonIgnore
  private ZonedDateTime createdAt = ZonedDateTime.now();

  @Getter
  @AllArgsConstructor
  @Accessors(fluent = true)
  public enum Exchange {
    DEFAULT(""),
    DIRECT("amq.direct"),
    FANOUT("amq.fanout"),
    TOPIC("amq.topic"),
    HEADERS("amq.headers");

    private final String type;
  }
}
