package com.luv2code.springcoredemo.common;

// Since there is no Component Annotation, this class cannot be injected when called in the Controller through Qualifier
public class SwimCoach implements Coach{

    public SwimCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up!";
    }
}
