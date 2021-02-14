package com.ncu.autowiring.LabQues;

public class A {
	private String Aname;
		private B b;
	private B1 b1;
	@Override
	public String toString() {
		return "A [Aname=" + Aname + ", b=" + b + ", b1=" + b1 + "]";
	}
	public B1 getB1() {
		return b1;
	}
	public void setB1(B1 b1) {
		this.b1 = b1;
	}
	public String getAname() {
		return Aname;
	}
	public void setAname(String aname) {
		Aname = aname;
	}
	
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}
	
	
}
