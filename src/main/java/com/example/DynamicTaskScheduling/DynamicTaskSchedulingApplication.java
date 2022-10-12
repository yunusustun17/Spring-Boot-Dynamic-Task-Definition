package com.example.DynamicTaskScheduling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DynamicTaskSchedulingApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicTaskSchedulingApplication.class, args);
    }

}
