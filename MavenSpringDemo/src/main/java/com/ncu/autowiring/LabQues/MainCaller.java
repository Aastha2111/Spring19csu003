package com.ncu.autowiring.LabQues;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCaller {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context= new ClassPathXmlApplicationContext("springAutowiringLab.xml");
		A cs=(A)context.getBean("AA");
		
		System.out.println(cs.toString());
	}

}
