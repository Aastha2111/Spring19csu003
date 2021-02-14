package com.ncu.Student_Desk;

public class Course {
	private String name;
	private int duration;
	private int discount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", duration=" + duration + ", discount=" + discount + "]";
	}

}
