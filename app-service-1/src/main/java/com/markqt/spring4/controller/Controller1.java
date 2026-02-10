package com.markqt.spring4.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {

    @GetMapping("/")
    String home() {
        return "1. Hello World! Service 1 " + com.markqt.libs.Utils.getMessage("Mark");
    }
}
