package com.ncu.javaConfigEmpl;


public class Employee implements IEmployee {
	

	private Address addr;
	
	@Override
	public String toString() {
		return "Employee [addr=" + addr + "]";
	}
	public String EmployeeName()
	{
		return "Employee name aastha";
	}
	
	public Employee(Address addr) {
		super();
		this.addr = addr;
	}
//	public Address getAddr() {
//		return addr;
//	}
//	public void setAddr(Address addr) {
//		this.addr = addr;
//	}
//	
	
}
