package com.ncu.autowiring.LabQues;



public class B {
private String Bname;
public String getBname() {
	return Bname;
}

public void setBname(String bname) {
	Bname = bname;
}


private C c;
public C getC() {
	return c;
}

public void setC(C c) {
	this.c = c;
}

@Override
public String toString() {
	return "B [Bname=" + Bname + ", c=" + c + "]";
}


}
