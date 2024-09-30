package com.example;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaClient
public interface ProducerClient {
    @Topic("AnimalTopic") // (2)
    void sendAnimalName( String name);
}
