package com.ncu.maven.CircularDependency;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("AA")
public class A {
	private B b;
	public B getB() {
		return b;
	}
	@Autowired
	public void setB( B b) {
		this.b = b;
		System.out.println("setter A");
	}

}
