package com.ncu.javaConfigEmpl;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;


@Configurable
@ComponentScan("com.ncu.javaConfigEmpl")  //to enable Annotation in ur project
public class ConfigJavaFile {

//	@Bean public Address Adr() 
//	{
//		return new Address("delhi","c12");
//	}
//	@Bean
//	public IEmployee Empl()	//diectly class to access those function not in interface
//	{
//		return new Employee(Adr());   
//	}
//	@Bean 
//	public Employee Empl1()
//	{
//		return new Employee(null);
//	}
	@Bean 
	public IEmplClass emp()
	{
		return new IEmplClass();
	}
	
}
