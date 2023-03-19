package com.luv2code.springcoredemo.common;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component // this is the component that spring can inject!
public class CricketCoach implements Coach{

    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice Daily Workout for 15 minutes!!!!";
    }
}
