package io.bearx.jwt.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(value = "/hello")
    public String firstPage() {
        return "Hello World";
    }

}