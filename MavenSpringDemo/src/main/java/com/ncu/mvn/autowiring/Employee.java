package com.ncu.mvn.autowiring;

public class Employee {
	
	private Department depart;
	private Address addr;
	
	@Override
	public String toString() {
		return "Employee [depart=" + depart + ", addr=" + addr + "]";
	}
	
	public Department getDepart() {
		return depart;
	}
	public void setDepart(Department depart) {
		this.depart = depart;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	
}
