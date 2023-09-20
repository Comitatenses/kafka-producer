package com.erman.kafkaproducer.controller;

import com.erman.kafkaproducer.service.TopicProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    private final TopicProducer topicProducer;
    @GetMapping(value = "/send/")
    public void send(@RequestParam("message") String message){
        topicProducer.send(message);
    }
}