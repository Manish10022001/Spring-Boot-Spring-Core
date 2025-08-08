package com.spring.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springcoredemo.common.Coach;

@RestController
public class DemoController {
    public Coach myCoach;
    
    //if there r multiple beans or class while injecting dependency, then for spring boot to choose that dependeny we use @Qualifier("beanName"), so get that specifice dependency
    //@Qualifieer(beanName) => name same as class Name and first letter lower case

    //Constructor Injection
    @Autowired
    public DemoController(@Qualifier("trackCoach") Coach theCoach){
        myCoach = theCoach;
    }
    
    //Setter Injection
    /* 
    @Autowired
    public void setCoach(@Qualifier("footballCoach") Coach theCoach){
        myCoach = theCoach;
    }
    */
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
