//package com.spring.demo.conditional;
//
//import com.spring.demo.annotation.GetUtil;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class ConditionalOnBeanExample {
//
//    @ConditionalOnBean(GetUtil.class)
//    @Bean
//    public ABeanWithCondition aBeanWithCondition() {
//
//        System.out.println("Đăng kí ABeanWithCondition là 1 bean khi bean Getutil đã tồn tại");
//
//        return new ABeanWithCondition();
//    }
//}
