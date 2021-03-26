package com.ncu.maven2.AOPDemo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectClass {

	@After("execution(public void name())")
	public void beforeA() {
		System.out.println( " Comming from before A method");
}
}