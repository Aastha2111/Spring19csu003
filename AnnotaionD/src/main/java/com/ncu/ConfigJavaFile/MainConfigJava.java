package com.ncu.ConfigJavaFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainConfigJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


    	ApplicationContext context = 
				new AnnotationConfigApplicationContext(JavaConfigFile.class);
		//ApplicationContext app=new ClassPathXmlApplicationContext("spring.xml");

		ICoach bc = context.getBean("BBCoach",BaseBall.class);//we can also refer interface clss
		ICoach bc1 = context.getBean("BBCoach",ICoach.class);
		System.out.println(bc.workout());
		System.out.println(bc1.workout());
		
		 BaseBall bc2 = context.getBean("BCoach",BaseBall.class);	
		System.out.println(bc2.BBworkout());
		
//		Coach hcoach=(Coach)app.getBean("hcoach",HockeyCoach.class);
				
		// call method to get the daily fortune
//		System.out.println(theCoach.getDailyFortune());
					
		// close the context
	
		
		//calling the method from spring xml
		System.out.println("xml configuration called here---------");
		System.out.println(hcoach.getDailyWorkout());
		System.out.println(hcoach.getDailyFortune());

		//calling constructor of cricketcoach class
//		Scanner sc=new Scanner(System.in);
//    	System.out.println("enter your name");
//    	String name=sc.next();
//    	CricketCoach thecoach1=(CricketCoach) context.getBean("coach","CricketCoach.class");
//    System.out.println(thecoach1.getName());
	}

}

