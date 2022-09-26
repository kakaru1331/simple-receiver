package me.kakaru.simplereceiver.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "hello world!";
    }

    @GetMapping("/headers")
    public String headers(@RequestHeader HttpHeaders headers) {
        return headers.toString();
    }

}
