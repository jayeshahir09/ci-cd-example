package com.example.dockerDemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {
    @GetMapping("/user")
    public ResponseEntity<String> getUser(){
        return ResponseEntity.ok("name:jayesh ahir,this is it");
    }
}
