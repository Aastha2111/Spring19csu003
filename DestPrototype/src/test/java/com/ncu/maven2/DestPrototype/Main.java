package com.ncu.maven2.DestPrototype;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
	    ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigPrototype.class);
	    
	    System.out.println("AASTHA-19CSU003");
		 System.out.println();   //NUMBER OF DESTRY IS HALF THE NUMBER OF CREATION
		 
        for (int i=0; i<2; i++) {
        	BPrototype b = ctx.getBean(BPrototype.class);
        }
        for (int i=0; i<3; i++) {
        	APrototype b = ctx.getBean(APrototype.class);
        }
        ctx.close();
	}

}
