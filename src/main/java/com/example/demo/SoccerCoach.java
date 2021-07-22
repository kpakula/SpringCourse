package com.example.demo;

public class SoccerCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Oh no, guys again - 500 meters around our playground, we need to be athletics";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
