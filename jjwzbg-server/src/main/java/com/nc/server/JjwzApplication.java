package com.nc.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.nc.server.mapper")
public class JjwzApplication {
    public static void main(String[] args) {
        SpringApplication.run(JjwzApplication.class, args);
    }
}
