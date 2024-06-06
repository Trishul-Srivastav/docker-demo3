package com.trishul.dockerdemo3.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/docker3")
public class HelloController {

    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Welcome to docker world!!!");
    }
}
