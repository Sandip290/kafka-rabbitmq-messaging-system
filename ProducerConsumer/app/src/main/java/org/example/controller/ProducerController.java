package org.example.controller;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producer")
public class ProducerController {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private static final String TOPIC = "user-events";

    public ProducerController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/event")
    public String sendEvent(@RequestBody String message) {
        kafkaTemplate.send(TOPIC, message);
        return "Event sent to Kafka";
    }
}
