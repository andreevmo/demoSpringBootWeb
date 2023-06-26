package ru.andreev.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/main")
public class DemoController {

    @GetMapping
    public String getMethod() {
        return "main";
    }

}
