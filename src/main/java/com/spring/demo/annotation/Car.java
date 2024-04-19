package com.spring.demo.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Car implements Vehicle {
    @Override
    public void printName() {
        System.out.println("Car");
    }
}
