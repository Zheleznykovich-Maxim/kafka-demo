package com.example.consumer.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "test_topic", groupId = "test_consumer")
    public void listen(String message) {
        System.out.println("Received: " + message);
    }

}
