package io.bearx.jwt.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secured/app")
public class AppController {

    @GetMapping
    public String verifyApplicationAccess() {
        return "Welcome!, you are secured";
    }
}
