package com.mywebapp.webapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {
    @RequestMapping("hello")
    public String greeting() {
        return "Hello World!";
    }

    @RequestMapping("hello2")
    public String greeting2() {
        return "Hello World2!";
    }

    @RequestMapping("hello3")
    public String greeting3() {
        return "Hello World3!";
    }
}
