package com.example.nbdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowWorldController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hi from cdemo - v1";
    }
}
