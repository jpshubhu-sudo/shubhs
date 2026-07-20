package com.newproject.demo.kafka;

import com.newproject.demo.entity.KafkaEmployee;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class KafkaProducer {
    private final KafkaTemplate<String, KafkaEmployee> kafkaTemplate;

    public void sendMessage(KafkaEmployee employee) {
        log.info("Kafka producer send employee class : {}", employee);
        Message<KafkaEmployee> message = MessageBuilder.withPayload(employee)
                .setHeader(KafkaHeaders.TOPIC, "employee").build();
        kafkaTemplate.send(message);
        log.info("Kafka producer send message : {}", message);
    }
}
