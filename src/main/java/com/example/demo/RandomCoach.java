package com.example.demo;

public class RandomCoach implements Coach{

    private FortuneService fortuneService;

    // no-arg constructor
    public RandomCoach() {
        System.out.println("RandomCoach: inside no-arg constructor");
    }

    // our setter method
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("RandomCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "RandomCoach: try something new today bro";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
