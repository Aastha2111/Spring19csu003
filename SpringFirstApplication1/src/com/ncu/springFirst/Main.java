package com.ncu.springFirst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
			Iworker sw = new SmartWorker(); //Upcasting 
			Manager mn = new Manager(sw); //passing smartworker object
			mn.ManageWork();
			Iworker lw = new LazyWorker(); //Upcasting 
			Manager mn2 = new Manager(lw);//passing lazyworker object
			mn2.ManageWork(); 
			Iworker ew = new ExtraOrdinary(); //Upcasting 
			Manager mn3 = new Manager(ew); //passing extraordinaryworker object
			mn3.ManageWork(); 
			*/
		
		
		// Stop creating objects in main class and assign this task to another class- FACTORY CLASS
//
//		Iworker sw = Factory.getObject() ;
//		Manager mn = new Manager(sw); //passing smartworker object
//		mn.ManageWork();
		
		// TODO Auto-generated method stub
				// load the spring configuration file i.e Bean file
						ApplicationContext context = 
								new ClassPathXmlApplicationContext("spring.xml");
								
						// retrieve the object(bean) from bean file and instantiat or upcaste 
						//that object to the Iworker class 
						Iworker smw = (Iworker)context.getBean("sw");
						
						// call methods on the bean
						Manager mn= new Manager(smw);
						mn.ManageWork();                //yaha vo function ayega jo manager class mei hai
														// vo nhi jo lazyworker class mei hai
						
						// let's call our new method for fortunes
//						System.out.println(theCoach.getDailyFortune());
						
						// close the context
						//context.close();
	
		}

			
	}


