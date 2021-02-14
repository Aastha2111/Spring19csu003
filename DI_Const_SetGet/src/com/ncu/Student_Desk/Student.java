package com.ncu.Student_Desk;

public class Student {
 private String name;
 private int id;
 private Course crs;
 

public Student(String name, int id) {
	super();
	this.name = name;
	this.id = id;
	
}

public Course getCrs() {
	return crs;
}

public void setCrs(Course crs) {
	this.crs = crs;
}

@Override
public String toString() {
	return "Student [name=" + name + ", id=" + id + ", crs=" + crs + "]";
}

public void CourseDetails()
{
	System.out.println(crs.toString());
	}
}
