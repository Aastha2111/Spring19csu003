package com.ncu.string_primitiveType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ct= new ClassPathXmlApplicationContext("springStringPrimitive.xml");
		
		IDAO dao=(IDAO)ct.getBean("dao");
		IDAO dao1=(IDAO)ct.getBean("dao2");
		dao.create();
		dao1.read();
	}

}
