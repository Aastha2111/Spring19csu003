package com.ncu.javaConfigEmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee implements IEmployee {
	
//	@Autowired
//	private Address addr;
//	
	@Override
//	public String toString() {
//		return "Employee 1[addr=" + addr + "]";
//	}
	public String EmployeeName()
	{
		return "Employee1 name aastha";
	}
	
//	public Employee(Address addr) {
//		super();
//		this.addr = addr;
//	}
//	public Address getAddr() {
//		return addr;
//	}
//	public void setAddr(Address addr) {
//		this.addr = addr;
//	}
//	
	
}
