package com.ncu.mavenSpring.AnnotaionD;

import org.springframework.stereotype.Component;

@Component
public class RestFortune implements IFortune {
	 public String getFortune()
	 {
		return " rest Fortune ";
	 }
      
}
