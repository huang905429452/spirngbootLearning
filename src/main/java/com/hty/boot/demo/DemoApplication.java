package com.hty.boot.demo;

import com.hty.boot.demo.BlogProperties.BlogProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    @Autowired
    private BlogProperties blogProperties;
    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
    }
}
