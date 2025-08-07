package com.spring.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springcoredemo.common.Coach;

@RestController
public class DemoController {
    public Coach myCoach;
    
    //we use @Qualifier to specify which bean to use , syntax: (@Qualifier("bean")), bean name shoudl be same as class but first letter small
    @Autowired
    public DemoController (@Qualifier("footballCoach") Coach theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
