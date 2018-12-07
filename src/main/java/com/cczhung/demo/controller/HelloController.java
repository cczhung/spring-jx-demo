package com.cczhung.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${env.test:'no env'}")
    private String envSrting;

    @RequestMapping("/")
    public String index() {
        return "test evn:"+envSrting;
    }
}