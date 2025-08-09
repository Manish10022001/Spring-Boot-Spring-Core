package com.spring.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    public FootballCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }
    
    @Override
    public String getDailyWorkout(){
        return "Practice free kicks for 30 mins";
    }
}
