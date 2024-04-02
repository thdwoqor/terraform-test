package org.example.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${token1}")
    private String token1;
    @Value("${token2}")
    private String token2;
    @GetMapping("/good")
    public String test() {
        return token1+token2+"hi";
    }
}
