package com.ncu.javaConfigEmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
public class Employee2 implements IEmployee {
//	@Autowired
//	private Address addr;
//	
//	@Override
//	public String toString() {
//		return "Employee2 [addr=" + addr + "]";
//	}
	public String EmployeeName()
	{
		return "Employee2 name aastha";
	}
	
//	public Employee2(Address addr) {
//		super();
//		this.addr = addr;
//	}
}
