package org.example.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaEventConsumer {

    @KafkaListener(topics = "user-events", groupId = "demo-group")
    public void consume(String message) {
        System.out.println("Consumed Kafka message: " + message);
    }
}
