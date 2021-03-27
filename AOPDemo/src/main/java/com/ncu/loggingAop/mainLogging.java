package com.ncu.loggingAop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class mainLogging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigLogging.class);
		Employee employee = context.getBean(Employee.class);
		System.out.println(employee);
		((AnnotationConfigApplicationContext)context).close();
	}

}
