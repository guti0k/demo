package com.spring.demo.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyCustomAndConditionExample {

    @Bean
    @Conditional(MyCustomAndCondition.class)
    public ABeanWithCondition aBeanWithCondition () {
        System.out.println("ABeanWithCondition được đăng kí bean khi cả 2 điều kiện của lớp MyCustomAndCondition thỏa mãn");

        return new ABeanWithCondition();
    }
}
