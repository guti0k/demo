package com.spring.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {


    @PostMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "Duy Quyền") String name) {
        return String.format("Hello %s", name);
    }
}
