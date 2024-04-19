package com.spring.demo.service;

import com.spring.demo.annotation.GetUtil;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private GetUtil getUtil;

    @PostConstruct
    public void postConstruct() {
        System.out.println("Post construct của UserService được tạo");
    }

    public void print() {
        System.out.println("User Service");
    }
}
