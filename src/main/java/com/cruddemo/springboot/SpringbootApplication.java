package com.cruddemo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
