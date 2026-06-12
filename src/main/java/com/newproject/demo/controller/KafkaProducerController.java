package com.newproject.demo.controller;

import com.newproject.demo.entity.KafkaEmployee;
import com.newproject.demo.kafka.KafkaProducer;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka/v1")
@AllArgsConstructor
public class KafkaProducerController {

    private final KafkaProducer kafkaProducer;

    @PostMapping("/publish")
    public ResponseEntity<String> sendMessage(@RequestBody KafkaEmployee employee) {
        kafkaProducer.sendMessage(employee);
        return new ResponseEntity<>("Message has been send sucessfully.", HttpStatus.OK);
    }
}
