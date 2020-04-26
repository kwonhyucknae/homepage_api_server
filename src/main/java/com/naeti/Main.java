package com.naeti;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Main {

    @Value("${app.test}")
    String test;

    @RequestMapping("/")
    public String Heelo() {
        return "Hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
