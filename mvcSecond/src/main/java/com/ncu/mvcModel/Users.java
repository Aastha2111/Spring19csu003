package com.ncu.mvcModel;

public class Users {
	private String userid;
	private String pwd;
	
		
	public Users() {
		super();
	}
	public Users(String userid, String pwd) {
		super();
		this.userid = userid;
		this.pwd = pwd;
				
	}
	public String getUserid() {
	return userid;
	}
	public void setUserid(String userid) {
	this.userid = userid;
	}
	public String getPwd() {
	return pwd;
	}
	public void setPwd(String pwd) {
	this.pwd = pwd;
	}
	
	
}
