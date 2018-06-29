package com.lanyyyy.springdemo.service;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.core.annotation.AliasFor;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Mapping
@RequestMapping
public @interface NewRM {

    @AliasFor(value="path", annotation = RequestMapping.class)
    String[] ph() default {};
//    @AliasFor(value="value", annotation = RequestMapping.class)
//    String[] ve() default {};
    @AliasFor(value="method", annotation = RequestMapping.class)
    RequestMethod[] md() default {};
    @AliasFor(attribute="path", annotation = RequestMapping.class)
    String[] ph2() default {};

}
