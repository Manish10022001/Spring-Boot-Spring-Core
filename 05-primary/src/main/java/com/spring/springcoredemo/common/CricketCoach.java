package com.spring.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//used @Primary instead of qualifier to tell the spring boot which implementation or coach to choose
@Primary
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout(){
        return "Practice bowling daily for 20 minutes 🎯";
    }
}
