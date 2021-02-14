package com.ncu.mvn.autowiring.Constructor;

public class Employee {
	private String empName;
	private Department depart;
	private Address addr;
	
	
	public Employee(String empName, Department depart, Address addr) {
		super();
		this.empName = empName;
		this.depart = depart;
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", depart=" + depart + ", addr=" + addr + "]";
	}

	public String getEmpName() {
		return empName;
	}
	
	public Department getDepart() {
		return depart;
	}
	
	public Address getAddr() {
		return addr;
	}
	
	
	
	
	
	
}
