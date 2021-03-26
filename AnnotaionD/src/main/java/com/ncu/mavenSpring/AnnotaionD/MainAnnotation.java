package com.ncu.mavenSpring.AnnotaionD;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainAnnotation {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			ApplicationContext ct = 
					new ClassPathXmlApplicationContext("springAnnotationD.xml");
			ICoach BCoach=(ICoach)ct.getBean("BBCoach",ICoach.class);
//			????what if interface hota  --->toh what we shall write 
//			.class OR .interface
			
//			BaseBall BCoach=(BaseBall)ct.getBean("BBCoach",BaseBall.class);
//			System.out.println(BCoach.getFortune());
//			System.out.println(BCoach.workout());
//			System.out.println();
			Tennis TCoach=(Tennis)ct.getBean("TTCoach",Tennis.class);
			System.out.println(TCoach.getFortune());
			System.out.println(TCoach.workout());
//			System.out.println(TCoach.toString());
			System.out.println();
			
//			Hockey HCoach=(Hockey)ct.getBean("HHCoach",Hockey.class);
//			System.out.println(HCoach.getFortune());
//			System.out.println(HCoach.workout());
//			System.out.println();
			
	}

}
