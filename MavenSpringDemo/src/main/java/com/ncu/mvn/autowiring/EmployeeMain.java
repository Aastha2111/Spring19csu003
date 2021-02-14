package com.ncu.mvn.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("springAutowiring.xml");
        Employee emp=(Employee)context.getBean("empl");
        System.out.println(emp.toString());

	}

}
