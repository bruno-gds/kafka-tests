package com.brunocompany.kafkatests.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class Consumer {

    @KafkaListener(topics = "messages", groupId = "messages-test")
    public void receiveMessage(String text) {
        System.out.println("<<<--- Recebendo do Kafka - TEXT: " + text);
    }
}
