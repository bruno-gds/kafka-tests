package com.brunocompany.kafkatests;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class Consumer {

    @KafkaListener(topics = "teste", groupId = "x")
    void receiveMessage(String message) {
        System.out.println("Consumer Message: " + message);
    }
}
