package AopAssgQ2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Q2Mainn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//aastha-19csu003
		AnnotationConfigApplicationContext ac =new AnnotationConfigApplicationContext(Q2Config.class);
		System.out.println("Aastha-19csu003");
	    X x=(X)ac.getBean("x",X.class);
	    x.logic();
	}

}
