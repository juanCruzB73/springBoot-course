package com.backend.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AplicationConfig {
    @Bean
    public MyFristClass myFristClass(){
        return new MyFristClass();
    }
}
