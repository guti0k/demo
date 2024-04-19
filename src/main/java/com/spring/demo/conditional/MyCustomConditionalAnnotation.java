package com.spring.demo.conditional;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(MyCustomCondition.class)
public //
@interface MyCustomConditionalAnnotation {
}
