package com.ncu.maven.CircularDependency;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class B {
@Autowired
private C c;
public C getC() {
	return c;
}

public void setC(C c) {
	this.c = c;
}

	
B() {
	System.out.println("Constructor B");
}
@PostConstruct
public void doStartup()     //no agrument method-no return type (VOID) 
{
	System.out.println("init(Startup) method calling ");
}

@PreDestroy
public void doCleanup() {					//method name needs not be same
	System.out.println("Destroy(CleanUp) method call");
}

}
