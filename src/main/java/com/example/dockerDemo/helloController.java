package com.example.dockerDemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    @GetMapping
    public ResponseEntity<String> getHello(){
        return ResponseEntity.ok("started Spring boot : hello world");
    }
}
