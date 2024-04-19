package com.spring.demo.annotation;

import org.springframework.stereotype.Component;

public class MyBean {

    private String message;

    public MyBean() {
        this.message = "Hello, I'm customer my bean";
    }

    public void getMessage() {
        System.out.println(message);
    }
}
