package com.ncu.CI_Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
//		ApplicationContext context= new ClassPathXmlApplicationContext("springCI_Demo.xml");
		ApplicationContext context= new ClassPathXmlApplicationContext("springCI_Demo_Constructor.xml");

		Customer cs=(Customer)context.getBean("customer");
		System.out.println(cs.toString());

	}

}
