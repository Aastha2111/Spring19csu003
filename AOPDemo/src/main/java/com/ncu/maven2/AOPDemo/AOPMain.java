package com.ncu.maven2.AOPDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOPMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigAspect.class);
		
		A a = context.getBean("AA",A.class);
	       
		a.name();
		
	       System.out.println(" IN MAIN CLASS ");
	
	       a.name();
	       
	       context.close();
	       
	}

}
