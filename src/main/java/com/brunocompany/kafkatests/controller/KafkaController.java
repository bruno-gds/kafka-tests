package com.brunocompany.kafkatests.controller;

import com.brunocompany.kafkatests.service.Producer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/kafka")
public class KafkaController {
    private final Producer producerService;


    KafkaController(Producer producerService) {
        this.producerService = producerService;
    }

    @GetMapping("/message/{text}")
    public String hello(@PathVariable("text") String text) {
        producerService.sendMessage(text);
        System.out.println("--->>> Enviado para o Kafka - TEXT: " + text);
        return "OK";
    }
}
