package com.lanyyyy.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringdemoApplication {

    public static void main(String[] args) {

        System.out.println("Service start");
        SpringApplication.run(SpringdemoApplication.class, args);
        System.out.println("Service end");

    }

}
