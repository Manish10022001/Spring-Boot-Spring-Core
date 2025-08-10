package com.spring.springcoredemo.common;

//not giving @Component intentionally
public class SwimCoach implements Coach {

    public SwimCoach(){
        System.out.println("In constructor: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Swim 100 metres as a warm up";
    }
}
