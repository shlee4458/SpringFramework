package com.luv2code.springcoredemo.common;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component // this is the component that spring can inject!
public class CricketCoach implements Coach{

    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    // Define our init method
    @PostConstruct
    public void myStartupStuff() {
        System.out.println("In doStartupStuff(): " + getClass().getSimpleName());
    }

    // Define our destory method
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("In doMyCleanupStuff(): " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice Daily Workout for 15 minutes!!!!";
    }
}
