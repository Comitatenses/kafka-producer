package com.erman.kafkaproducer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TopicConsumer {

    @KafkaListener(groupId = "test", topics = "test")
    public void consumeTopic(String message) {
        log.info("Message Consumed: " + message);
    }
}
