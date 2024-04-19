package com.spring.demo.annotation;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
    @Override
    public void printName() {
        System.out.println("Bike");
    }
}
