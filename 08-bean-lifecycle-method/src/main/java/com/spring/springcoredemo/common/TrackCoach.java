package com.spring.springcoredemo.common;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


@Component


public class TrackCoach implements Coach {

    public TrackCoach(){
        System.out.println("In Constructor: "+ getClass().getSimpleName());
    }

    // Define our init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In doMyStartupStuff : " +getClass().getSimpleName());
    }

    // Define our destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("In doMyCleanupStuff :" +getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Run daily for 1 hr";
    }
}
