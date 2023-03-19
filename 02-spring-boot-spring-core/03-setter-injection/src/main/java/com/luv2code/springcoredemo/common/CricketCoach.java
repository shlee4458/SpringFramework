package com.luv2code.springcoredemo.common;


import org.springframework.stereotype.Component;

@Component // this is the component that spring can inject!
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice Daily Workout for 15 minutes!!!!";
    }
}
