package com.ncu.maven.CircularDependency;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("AA")
@Scope("prototype")

public class A {
	private B b;
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}
	A() {
		System.out.println("Constructor A");
	}
	
}
