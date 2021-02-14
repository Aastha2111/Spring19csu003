package com.ncu.mvn.autowiring.Constructor;

public class Department {
 String Dept_name;
 int Dept_no;
@Override
public String toString() {
	return "Department [Dept_name=" + Dept_name + ", Dept_no=" + Dept_no + "]";
}
public String getDept_name() {
	return Dept_name;
}
public void setDept_name(String dept_name) {
	Dept_name = dept_name;
}
public int getDept_no() {
	return Dept_no;
}
public void setDept_no(int dept_no) {
	Dept_no = dept_no;
}

}
