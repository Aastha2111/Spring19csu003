package com.ncu.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//isme humne koi manager classs nhi banyo jo COACH INTERFACE KO handle kr rhi hai??
		
		ApplicationContext ct = 
				new ClassPathXmlApplicationContext("springDIFort.xml");
		ICoach BCoach=(ICoach)ct.getBean("BBCoach");
		System.out.println(BCoach.getFortune());
		System.out.println(BCoach.workout());
		ICoach TCoach=(ICoach)ct.getBean("TTCoach");
		System.out.println(TCoach.getFortune());
		System.out.println(TCoach.workout());
		
	}

}
