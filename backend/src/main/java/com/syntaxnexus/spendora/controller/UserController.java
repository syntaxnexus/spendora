package com.syntaxnexus.spendora.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping(value = "/check", produces = "application/json")
    public ResponseEntity<String> checkUser(){
        return ResponseEntity.ok("Good Job");
    }
}