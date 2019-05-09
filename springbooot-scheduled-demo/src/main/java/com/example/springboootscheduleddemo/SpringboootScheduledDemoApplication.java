package com.example.springboootscheduleddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringboootScheduledDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringboootScheduledDemoApplication.class, args);
    }

}
