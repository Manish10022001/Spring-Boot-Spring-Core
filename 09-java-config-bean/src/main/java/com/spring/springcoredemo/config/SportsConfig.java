package com.spring.springcoredemo.config;

import com.spring.springcoredemo.common.Coach;
import com.spring.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//create configuration class: created new package and new class
//define bean method to configure the class
@Configuration
public class SportsConfig {
    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
