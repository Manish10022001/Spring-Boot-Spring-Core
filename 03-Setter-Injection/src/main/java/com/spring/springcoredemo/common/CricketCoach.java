package com.spring.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout(){
        return "Practice bowling daily for 20 minutes";
    }
}
