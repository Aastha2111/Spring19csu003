package com.ncu.ConstCoach;

public class BaseBall implements ICoach {
//	public void workout()
//	{
//    System.out.println("let's play BAseBall Today");
//	}
	private String name;
	private int age;
	private String email;
	private Address add;
	private IFortune ifortune;
	
	public BaseBall(IFortune ifortune,String name,String email,int age ,Address add) {
		System.out.println("constructo call to initialize the paremeters");
		this.ifortune=ifortune;
		this.name=name;
		this.email=email;
		this.age=age;
		
		this.add=add;
	}
	

	@Override
	public String toString() {
		return "BaseBall [ifortune=" + ifortune + ", name=" + name + ", email=" + email + ", age=" + age
				+ ", add=" + add + "]";
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

}
