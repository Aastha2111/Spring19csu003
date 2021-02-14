package com.ncu.CI_Demo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.Vector;

public class Customer {
	private List<String> names=new Vector<String>();
	private Set<Long> Phno;
	private Map<Long, String> aadharNo;
	private Map<Long, Address> address;
	private Properties email;
	
//	CONTRUCTOR
	public Customer(List<String> names,Set<Long> Phno,Map<Long, String> aadharNo,Properties email, Map<Long, Address> address ) {
	this.names=names;
	this.Phno=Phno;
	this.aadharNo=aadharNo;
	this.email=email;
	this.address=address;
	}

	

	@Override
	public String toString() {
		return "Customer [names=" + names + ", Phno=" + Phno + ", \n aadharNo=" + aadharNo + ",\n address=" + address
				+ ",\n email=" + email + "]";
	}
	
	//
//	public List<String> getNames() {
//		return names;
//	}


//	public void setNames(List<String> names) {
//		this.names = names;
//	}
//	public Set<Long> getPhno() {
//		return Phno;
//	}
//	public void setPhno(Set<Long> phno) {
//		Phno = phno;
//	}
//	public Map<Long, String> getAadharNo() {
//		return aadharNo;
//	}
//	public void setAadharNo(Map<Long, String> aadharNo) {
//		this.aadharNo = aadharNo;
//	}
//
//
//	public Properties getEmail() {
//		return email;
//	}
//
//
//	public void setEmail(Properties email) {
//		this.email = email;
//	}
//	public Map<Long, Address> getAddress() {
//		return address;
//	}
//	public void setAddress(Map<Long, Address> address) {
//		this.address = address;
//	}
}
