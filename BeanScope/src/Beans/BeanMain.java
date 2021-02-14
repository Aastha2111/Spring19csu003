package Beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("springBean.xml");
		
		System.out.println("bean factory loading ..");
		ICoach coach=(ICoach)context.getBean("beanlife");   //instance create--goes to default costructor
		ICoach Tcoach=(ICoach)context.getBean("TTCoach");
		System.out.println(Tcoach.getFortune());
		System.out.println(Tcoach.workout());
		System.out.println(coach.getFortune());
		System.out.println(coach.workout());
//		System.out.println(coach1.getFortune());
//		System.out.println(coach1.workout());
		((ClassPathXmlApplicationContext)context).close();  //downcasting as close() is used with context.
			
		ICoach coach1=(ICoach)context.getBean("beanlife");  //we cannot instantiate bean after class closing
		System.out.println(coach1.getFortune());  
		System.out.println(coach1.workout());
	}

}
