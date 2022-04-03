package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo0Controller {
    @GetMapping("/home1")
    public String Home1()
    {

        return "working";
    }
}
