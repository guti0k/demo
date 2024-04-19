//package com.spring.demo.conditional;
//
//import lombok.experimental.Helper;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnJava;
//import org.springframework.boot.system.JavaVersion;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class ConditionalOnJavaExample {
//
//    @ConditionalOnJava(JavaVersion.NINETEEN)
//    @Bean
//    public ABeanWithCondition aBeanWithCondition() {
//        System.out.println("Đăng kí ABeanWithCondition là 1 bean khi Java đúng version chỉ định");
//
//        return new ABeanWithCondition();
//    }
//}
