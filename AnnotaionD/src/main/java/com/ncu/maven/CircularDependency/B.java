package com.ncu.maven.CircularDependency;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//19csu003-aastha

@Component
public class B {
	 A a;
	 
//	    @Autowired
//	    public B(@Lazy A a) {
//	        super();
//	        this.a = a;
//	        System.out.println("Constructor B");
//	    }
	 
	    public A getA() {
	        return a;
	    }
	    @Autowired
	    public void setA(A a) {
	        this.a = a;
	        System.out.println("Setter B");
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
