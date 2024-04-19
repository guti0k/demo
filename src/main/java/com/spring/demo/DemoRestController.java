package com.spring.demo;

import com.spring.demo.configProperties.DemoAppProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    @Autowired
    private DemoAppProperties demoAppProperties;

    @RequestMapping("/test")
    public String testRestController() {
        return demoAppProperties.toString();
    }
}
