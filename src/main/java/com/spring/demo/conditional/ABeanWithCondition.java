package com.spring.demo.conditional;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class ABeanWithCondition {

    private String message;

    public ABeanWithCondition() {
        message = "ABeanWithCondition đã được đăng kí vào IOC Container";
    }
}
