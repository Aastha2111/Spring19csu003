package com.ncu.mavenSpring.AnnotaionD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("TTCoach") 
public class Tennis implements ICoach {
	
	
	private IFortune ifortune;
	
//	@Value(value="aastha")
//	private String name;
//	
//	@Value(value="23")     //-implicit type convertion by Spring
//	private int age;
	
	@Autowired     //-autowiring through constructor
	
	public Tennis(@Qualifier("fortune")IFortune ifortune)
	{
		this.ifortune=ifortune;
//		this.name=name;
//		this.age=age;
		System.out.println("in tennis constructor");
	}
	
//	public String toString() {
//		return "Tennis Coach [name=" + name + ", age=" + age + "]";
//	}
	@Override
	public String workout()

	{
		return "let's play Tennis Today";
	}
	@Override
	public String toString() {
		return "Tennis [ifortune=" + ifortune + "]";
	}
	@Override
	public String getFortune()

	{
		return ifortune.getFortune();
	}

}
