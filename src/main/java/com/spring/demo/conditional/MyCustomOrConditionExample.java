//package com.spring.demo.conditional;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Conditional;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class MyCustomOrConditionExample {
//
//
//    @Bean
//    @Conditional(MyCustomOrCondition.class)
//    public ABeanWithCondition aBeanWithCondition () {
//        System.out.println("ABeanWithCondition được đăng kí bean khi 1 trong 2 điều kiện của lớp MyCustomOrCondition thỏa mãn");
//
//        return new ABeanWithCondition();
//    }
//}
