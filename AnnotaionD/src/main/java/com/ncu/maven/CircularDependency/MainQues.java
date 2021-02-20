package com.ncu.maven.CircularDependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ncu.mavenSpring.AnnotaionD.Tennis;



public class MainQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		ApplicationContext context= new ClassPathXmlApplicationContext("springAnnotaCircularDep.xml");
		System.out.println("bean factory loading ..");
		A cs=(A)context.getBean("AA");
		A cs1=(A)context.getBean("AA");
		((ClassPathXmlApplicationContext)context).close(); // destroy donot works with prototype here A scope is protype
															// init & destroy method is in B

	}

}
