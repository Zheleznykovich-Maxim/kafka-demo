package com.example.producer.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfiguration {

    @Bean
    public NewTopic topic() {
        return new NewTopic(
                "topic-test",
                3,
                (short) 1
        );
    }

}
