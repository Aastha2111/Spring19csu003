package com.ncu.POJO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class pojoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context = new ClassPathXmlApplicationContext("springPojo.xml");
	        System.out.println("MY SQL OPERATIONS");
	        Operation op = (Operation)context.getBean("mySqlDao");
	        op.create();
	        op.delete();
	        op.read();
	        op.update();
	        System.out.println();
	        System.out.println("ORACLE OPERATIONS");
	        Operation op2 = (Operation)context.getBean("oracleDao");
	        op2.create();
	        op2.delete();
	        op2.read();
	        op2.update();
	        System.out.println();
	        System.out.println("POS GRES OPERATIONS");
	        Operation op3 = (Operation)context.getBean("postgresDao");
	        op3.create();
	        op3.delete();
	        op3.read();
	        op3.update();
	}

}



