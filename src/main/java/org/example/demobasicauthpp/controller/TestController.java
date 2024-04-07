package org.example.demobasicauthpp.controller;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SecurityRequirement(name = "basicAuth")
public class TestController {
    @GetMapping("/test")
    public String test() {
        return "Hello spring";
    }

    @GetMapping("/user")
    public String user() {
        return "Hello user";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Hello admin";
    }
    @GetMapping("/welcome")
    public String auth() {
        return "Hello authentication";
    }
}
