package com.ncu.custModel;

import java.sql.Date;

public class Update {
	

	
	private String userid;
	private String lname;
	private String pwd;
	private String email;
	private int phno;
	private String gender;
//	private Date dob;
	private String addr;
	private String state;
	private String country;
	
	
	public Update() {}
	
	
	public Update(String userid, String lname, String pwd, String email, int phno, String gender, String addr, String state,
		String country) {

	this.userid = userid;
	this.lname = lname;
	this.pwd = pwd;
	this.email = email;
	this.phno = phno;
	this.gender = gender;
	this.addr = addr;
	this.state = state;
	this.country = country;
}


	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getPhno() {
		return phno;
	}


	public void setPhno(int phno) {
		this.phno = phno;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	
	


}
