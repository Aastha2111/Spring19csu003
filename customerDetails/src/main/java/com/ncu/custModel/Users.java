package com.ncu.custModel;

import java.sql.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.ncu.customValid.Validations.MyCourseCode;
import com.ncu.customValid.Validations.MyPassword;

//
public class Users {

//	@Column(length = 20, nullable = false)--dependency not taken yet
//	@NotNull(message="is required")
	
	private String userid;
	

	@NotNull(message="is required")
	@Size(min=3, message="atleast 3 character")
	private String lname;

	//@Email
	@NotNull(message="is required")
	@Pattern(regexp= "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message="incorrect email format")
	private String email;
	
//	@MyPassword(value="",message="Must contain at least one digit,special characters(@,#,$),have 6 to 20 characters")
	@NotNull
    @Size(min=8,message="minimum 8 characters required")
    @MyPassword
	private String pwd;
		
	@NotNull(message="is required")
	@Pattern(regexp= "[0-9]{10}", message="Only 10 digits allowed")
	private String phno;
	private String gender;
	
//	private Date dob;
	private String addr;
	private String state;
	private String country;
	

	@MyCourseCode(value={"CSE","ECE","CSL","SOM"}, message="must start with CSE,ECE,CSL,SOM")
	private String courseCode;
	
	
	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
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

