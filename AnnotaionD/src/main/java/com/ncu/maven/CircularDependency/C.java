package com.ncu.maven.CircularDependency;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Lazy
@Component
@Scope("prototype")
public class C {
		
		public C()
		{
			System.out.println("constructor C");
		}

			 
}
