package com.nkyd.ebs.sboot.hworld.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String helloMessage() {
        return "Hello World!";
    }
}
