package com.codeDemo.springcoredemo.config;

import com.codeDemo.springcoredemo.common.Coach;
import com.codeDemo.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
