package com.ncu.javaConfigEmpl;

import org.springframework.stereotype.Component;

//@Component
public class Address {
	private String city;
	private String house_no;
	


	@Override
	public String toString() {
		return "Address [city=" + city + ", house_no=" + house_no + "]";
	}



	public Address(String city, String house_no) {
		super();
		this.city = city;
		this.house_no = house_no;
	}
	
	
}
