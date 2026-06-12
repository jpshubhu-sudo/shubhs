package com.newproject.demo.kafka;

import com.newproject.demo.entity.KafkaEmployee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "employee_json", groupId = "myGroup")
    public void receiveMessage(KafkaEmployee employee) {
        log.info("Kafka consumer receive employee class : {}", employee);
    }
}
