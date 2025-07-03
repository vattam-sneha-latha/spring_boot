package com.springboot.firstapp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.springboot.firstapp.bean.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController // @Controller + @ResponseBody
public class HelloWorldController {


    // http://localhost:8080/hello-world

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello worldd";
    }
    
}
