package com.example;

import com.example.config.RestServerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SpringApplication.run(RestServerConfig.class, args);
    }
}
