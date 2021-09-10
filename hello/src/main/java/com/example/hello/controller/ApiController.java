package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 해당 Class는 Rest API 를 처리하는 controller
@RequestMapping("/api") // RuquestMapping URI 지정해주는 annotation
public class ApiController {

    @GetMapping("/hello")   //  http://localhost:9090/api/hello
    public String hello(){
        return "hello spring boot";
    }
}
