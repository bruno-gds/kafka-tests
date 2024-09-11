package com.brunocompany.kafkatests;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class Producer {
    private final KafkaTemplate<String, String> kafkaTemplate;


    Producer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    void sendMessage(String message) {
        kafkaTemplate.send("teste", message);
    }
}
