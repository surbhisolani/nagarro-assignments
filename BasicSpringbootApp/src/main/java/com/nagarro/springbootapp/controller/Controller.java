package com.nagarro.springbootapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springboot")
public class Controller {
	@GetMapping("/getMessage")
    public ResponseEntity<String> getMessage() {
        String message = "Hello";
        return ResponseEntity.ok(message);
    }
}
