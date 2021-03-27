package com.ncu.Assgn2.q2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.ncu.Assgn2.q1")
public class Config {

	@Bean
	@Scope("prototype")
	public Employee employee() {
		return new Employee(19003,"aastha", "madaan","aastha19csu003@ncuindia.edu");
	}
	@Bean
	@Scope("singleton")
	public EmployeeService employeeService() {
		return new EmployeeService();
	}
}
