//package com.spring.demo.conditional;
//
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class ConditionalOnPropertyExample {
//
//    @Bean
//    @ConditionalOnProperty(
//            value="duyquyen.email",
//            havingValue = "nguyenduyquyen0017@gmail.com", // Bean chỉ được tạo nếu giá trị property là khớp với havingValue
//            matchIfMissing = false) // Bean không được tạo nếu property không tồn tại
//    ABeanWithCondition aBeanWithCondition(){
//        System.out.println("Đăng kí ABeanWithCondition là 1 bean khi property đã tồn tại");
//
//        return new ABeanWithCondition();
//    }
//}
