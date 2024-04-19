//package com.spring.demo.conditional;
//
//import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class ConditionalOnExpressionExample {
//
//// nhận giá trị true false cho dễ check
//    @ConditionalOnExpression("${demo.enabled:true}")
//    @Bean
//    public ABeanWithCondition aBeanWithCondition() {
//        System.out.println("Đăng kí ABeanWithCondition là 1 bean khi cùng thỏa mãn 2 điều kiện");
//
//        return new ABeanWithCondition();
//    }
//}
