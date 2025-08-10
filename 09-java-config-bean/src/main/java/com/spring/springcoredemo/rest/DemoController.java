package com.spring.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springcoredemo.common.Coach;

@RestController
public class DemoController {
	
//	define private field for dependecny
    public Coach myCoach;

    
    @Autowired
    public DemoController(@Qualifier("swimCoach") Coach theCoach){
        System.out.println("In Constructor: "+ getClass().getSimpleName());
        myCoach = theCoach;
    }
    
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
    
    
}
