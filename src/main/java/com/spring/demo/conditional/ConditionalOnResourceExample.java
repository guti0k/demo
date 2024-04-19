//package com.spring.demo.conditional;
//
//import com.spring.demo.annotation.TestBean;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class ConditionalOnResourceExample {
//
//    @ConditionalOnResource(resources = "/application.yml")
//    @Bean
//    public ABeanWithCondition aBeanWithCondition() {
//        System.out.println("Đăng kí ABeanWithCondition là 1 bean khi resource tồn tại");
//
//        return new ABeanWithCondition();
//    }
//}
