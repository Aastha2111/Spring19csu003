package Circular_Scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context= new ClassPathXmlApplicationContext("AssQues.xml");
		A cs=(A)context.getBean("AA");
		A cs1=(A)context.getBean("AA");
//		
//		cs.setAName("aastha");
//		cs.setB("aastha");
//		System.out.println(cs.toString());
//		
//		System.out.println(cs1);
//		System.out.println(cs1.toString());
	}

}
