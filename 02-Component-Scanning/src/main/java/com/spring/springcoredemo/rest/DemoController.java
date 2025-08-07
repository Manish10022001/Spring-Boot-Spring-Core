package com.spring.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springcoredemo.common.Coach;

@RestController
public class DemoController {
    public Coach myCoach;
    //Setter Injection, we can give any name to setter method after giving @Autowired
    @Autowired
    public void setCoach(Coach theCoach){
        myCoach = theCoach;
    }
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
