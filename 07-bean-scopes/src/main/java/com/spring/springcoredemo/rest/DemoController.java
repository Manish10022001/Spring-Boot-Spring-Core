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
    public Coach anotherCoach;
    
    @Autowired
    public DemoController(@Qualifier("trackCoach") Coach theCoach,
    					  @Qualifier("trackCoach") Coach theAnotherCoach){
        System.out.println("In Constructor: "+ getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }
    
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
    
    @GetMapping("/check")
    public String check() {
    	return "Comparing beans: myCoach == anotherCoach : "+ (myCoach == anotherCoach);
    }
}
