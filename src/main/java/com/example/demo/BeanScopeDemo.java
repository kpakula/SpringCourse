package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {
    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // retrieve bean from spring container
        Coach coach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // check if they are the same
        boolean result = (coach == alphaCoach);

        // print out the results
        System.out.println("\nPointing to the same object: " + result);

        System.out.println();
        System.out.println("Memory location for theCoach: " + coach);
        System.out.println("Memory location for theCoach: " + alphaCoach);
    }
}
