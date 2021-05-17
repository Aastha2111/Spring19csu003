package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);
        Coach coach1 = context.getBean("cricketCoach1",Coach.class);
        System.out.println(coach1.getWorkout());
        CricketCoach coach2 = context.getBean("cricketCoach2",CricketCoach.class);
        System.out.println(coach2.getAdvice());
    }
}
