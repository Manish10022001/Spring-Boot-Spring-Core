package com.spring.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout(){
        return "Run daily for 1 hr";
    }
}
