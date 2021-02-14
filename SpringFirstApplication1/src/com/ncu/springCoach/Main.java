package com.ncu.springCoach;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		ApplicationContext context=new ClassPathXmlApplicationContext("springCoach.xml"); //BAseBall ICoach
		ICoach BIc=(ICoach)context.getBean("BBIc");
		HeadCoach hd=new HeadCoach(BIc);
		hd.CoachAssign();
		//yaha vo function ayega jo manager class mei hai
		// vo nhi jo lazyworker class mei hai
		
		
	}

}
