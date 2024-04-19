package com.spring.demo.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Driver {

    @Autowired
    private Vehicle vehicle;

    public void printName() {
        System.out.print("Driver with vehicle: ");
        vehicle.printName();
    }
}
