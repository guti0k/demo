package com.spring.demo.annotation;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GetUtil {

    @PostConstruct
    public void postConstruct() {
        System.out.println("Đối tượng GetUtil sao khi được quản lý, và khởi tạo sẽ gọi postConstruct");
    }


    @PreDestroy
    public void preDestroy() {
        System.out.println("Đối tượng GetUtil trước khi bị phá hủy sẽ gọi preDestroy");
    }

    public String userName;

    @Autowired
    public GetUtil(@Value("${demo.username}") String userName) {
        this.userName = userName;
    }
}
