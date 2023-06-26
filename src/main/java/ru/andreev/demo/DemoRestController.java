package ru.andreev.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/rest")
public class DemoRestController {

    @GetMapping
    public String getMethod() {
        return "Hello from restController";
    }
}
