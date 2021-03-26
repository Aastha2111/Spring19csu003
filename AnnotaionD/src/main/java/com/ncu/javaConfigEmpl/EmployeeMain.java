package com.ncu.javaConfigEmpl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		//s TODO Auto-generated method stub
		

    	ApplicationContext context = 
				new AnnotationConfigApplicationContext(ConfigJavaFile.class);
		//ApplicationContext app=new ClassPathXmlApplicationContext("spring.xml");

//		IEmployee emp = context.getBean("Empl",IEmployee.class);//we can also refer interface clss
//		Employee emp1=context.getBean("Empl1",Employee.class);
//		System.out.println(emp.toString());
//		System.out.println(emp1.EmployeeName());
		
		IEmplClass emp = context.getBean("emp",IEmplClass.class);
		System.out.println(emp.EmployeeName());

	}

}
