package com.ncu.mvn.autowiring.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMainConstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			
	        ApplicationContext context=new ClassPathXmlApplicationContext("springAutowiringConstr.xml");
	        Employee emp=(Employee)context.getBean("empl");
	        System.out.println(emp.toString());

		}

	}

