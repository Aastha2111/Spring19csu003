package com.ncu.ConstCoach;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//isme humne koi manager classs nhi banyo jo COACH INTERFACE KO handle kr rhi hai??
		
		ApplicationContext ct = 
				new ClassPathXmlApplicationContext("springConstCoach.xml");
		ICoach BCoach=(ICoach)ct.getBean("BBCoach");
		System.out.println(BCoach.getFortune());
		System.out.println(BCoach.workout());
		System.out.println();
		System.out.println(BCoach.toString());
		
	}

}
