package org.example.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${token}")
    private String token1;
    @GetMapping("/good")
    public String test() {
        return token1+"hi";
    }
}
