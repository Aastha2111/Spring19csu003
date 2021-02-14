package com.ncu.spellChecker;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ct = 
				new ClassPathXmlApplicationContext("springSpellChecker.xml");
		//WRONG TextEditor te= new(TextEditor)ct.getBean(edit);
		TextEditor te=(TextEditor)ct.getBean("tEdit");
		System.out.println(te.getText());
		te.getChecker();
		
		
		
	}

}
