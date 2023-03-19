package com.luv2code.springcoredemo.common;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // this is the component that spring can inject!
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // define the scope as prototype -- for every dependency injection new instance is created
public class CricketCoach implements Coach{

    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice Daily Workout for 15 minutes!!!!";
    }
}
