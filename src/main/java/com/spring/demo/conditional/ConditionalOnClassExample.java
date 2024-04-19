//package com.spring.demo.conditional;
//
//import com.spring.demo.annotation.TestBean;
//import lombok.experimental.Helper;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class ConditionalOnClassExample {
//
//    @ConditionalOnClass(Helper.class)
//    @Bean
//    public ABeanWithCondition aBeanWithCondition() {
//        System.out.println("Đăng kí ABeanWithCondition là 1 bean khi 1 class chỉ định đã tồn tại trong classPath");
//
//        return new ABeanWithCondition();
//    }
//}
