package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        // Load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve bean from spring container
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

        // Call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // Call our new methods to get the literal values
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());

        System.out.println();

        // OKAY
        RandomCoach randomCoach = context.getBean("myRandomCoach", RandomCoach.class);

        // Call methods on the bean
        System.out.println(randomCoach.getDailyWorkout());
        System.out.println(randomCoach.getDailyFortune());

        // Close the context
        context.close();
    }
}
