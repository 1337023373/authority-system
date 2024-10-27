package com.hengheng;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.hengheng.dao")
@SpringBootApplication
public class AuthoritySystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthoritySystemApplication.class, args);
    }
}