package com.luv2code.springcoredemo.common;

import jdk.jfr.Percentage;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class TrackCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5K";
    }
}
