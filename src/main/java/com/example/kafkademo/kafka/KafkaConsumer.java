package com.example.kafkademo.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @KafkaListener(topics = "test", groupId = "newGroup")
    public void lister(String message) {
        System.out.println(message);
    }
}
