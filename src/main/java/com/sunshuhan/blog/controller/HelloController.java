package com.sunshuhan.blog.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/helloworld")
    public String hello() {
        return "Hello Spring Boot!";
    }
}
