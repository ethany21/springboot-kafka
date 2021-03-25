package com.github.ethany21.springbootkafka.controller;

import com.github.ethany21.springbootkafka.model.Class;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @PostMapping("/v1/libraryevent")
    public ResponseEntity<Class> postAttendanceEvent(@RequestBody Class aClass){
        return ResponseEntity.status(HttpStatus.CREATED).body(aClass);
    }

}
