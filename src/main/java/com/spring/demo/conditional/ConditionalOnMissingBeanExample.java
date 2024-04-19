//package com.spring.demo.conditional;
//
//import com.spring.demo.annotation.TestBean;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class ConditionalOnMissingBeanExample {
//
//    @ConditionalOnMissingBean
//    @Bean
//    public TestBean testBean() {
//        System.out.println("Đăng kí TestBean là 1 bean khi TestBean chưa được đki bean");
//
//        return new TestBean();
//    }
//}
