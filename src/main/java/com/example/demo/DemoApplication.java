package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}

//@RestController
//@RequestMapping("/api")
//@Slf4j
//
//class temp {
//    @GetMapping
//    public String hello() {
//        log.info("This is just a {}", "Info");
//        return "Hello World";
//    }
//}
