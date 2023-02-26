package com.stephenk.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "stephenk", groupId = "default")
    void listener(String data) {
        System.out.println("Listener received: " + data);
    }
}
