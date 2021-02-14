package com.ncu.SetGet;

public class BaseBall implements ICoach {
//	public void workout()
//	{
//    System.out.println("let's play BAseBall Today");
//	}
	private String name;
	private int age;
	private String email;
	private IFortune ifortune;
	private Address add;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public IFortune getIfortune() {
		return ifortune;
	}

	public void setIfortune(IFortune ifortune) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.ifortune = ifortune;
	}
	

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}
	public String myAddress()
	{
		return add.toString();
	}
	
	
	
	@Override
	public String workout()

	{
		return "let's play BaseBall Today";
	}
	@Override
	public String getFortune()

	{
		return ifortune.getFortune();
	}

	@Override
	public String toString() {
		return " [ifortune=" + ifortune + ", name=" + name + ",age=" + age + ", email=" + email + "]";
	}
}
