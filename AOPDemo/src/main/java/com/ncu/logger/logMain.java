package com.ncu.logger;

public class logMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
	      
		AccountDemo a = (AccountDemo)context.getBean("accountDemo",AccountDemo.class);
	    a.print();
//	    System.out.println("************************************");
//	       B b = (B)context.getBean("b", B.class);
//	       b.print2();
	       context.close();
	}

}
