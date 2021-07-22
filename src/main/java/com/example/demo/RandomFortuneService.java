package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class RandomFortuneService implements FortuneService {

    private final List<String> fortuneList;

    public RandomFortuneService() {
        this.fortuneList = new ArrayList<>(Arrays.asList("Fortune I", "Fortune II", "Fortune III"));
    }

    @Override
    public String getFortune() {
        int randomNum = ThreadLocalRandom.current().nextInt(0, fortuneList.size());
        return fortuneList.get(randomNum);
    }
}
