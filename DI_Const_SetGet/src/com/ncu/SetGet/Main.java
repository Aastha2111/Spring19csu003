package com.ncu.SetGet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//isme humne koi manager classs nhi banyo jo COACH INTERFACE KO handle kr rhi hai??
		
		ApplicationContext ct = 
				new ClassPathXmlApplicationContext("springSetGet.xml");
		ICoach BCoach=(ICoach)ct.getBean("BBCoach");
		System.out.println(BCoach.getFortune());
		System.out.println(BCoach.workout());
		System.out.println(BCoach.getName());
		System.out.println(BCoach.toString());
		System.out.println(BCoach.myAddress());
		
		
	}

}
