package com.ncu.mvn.MavenSpringDemo;

public class A {
	private B b;
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}
	A() {
		System.out.println("Constructor A");
	}
	
}
