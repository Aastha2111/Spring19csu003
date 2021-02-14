package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//isme humne koi manager classs nhi banyo jo COACH INTERFACE KO handle kr rhi hai??
		
		ApplicationContext ct = 
				new ClassPathXmlApplicationContext("springDemo.xml");
		ICoach BCoach=(ICoach)ct.getBean("TTCoach");
		ICoach BCoach1=(ICoach)ct.getBean("TTCoach");
//		System.out.println(BCoach.getFortune());
//		System.out.println(BCoach.workout());
//		System.out.println(BCoach1.getCoachName());
		
//		System.out.println("PROTOTYPE IMPLEMENTATION");
		System.out.println("SINGLETON IMPLEMENTATION");
		System.out.println(BCoach1);
		
		System.out.println(BCoach);
		
//		System.out.println(BCoach.getCoachName());
//		System.out.println(BCoach.toString());
//		System.out.println(BCoach.myAddress());
		
		
	}

}
