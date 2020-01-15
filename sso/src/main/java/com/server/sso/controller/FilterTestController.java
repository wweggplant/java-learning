package com.server.sso.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FilterTestController
 */
@RestController
@RequestMapping("/api")
public class FilterTestController {

    @GetMapping("/hello")
    public String getHello() throws InterruptedException {
        Thread.sleep(1000);
        return  "hello";
    }
}