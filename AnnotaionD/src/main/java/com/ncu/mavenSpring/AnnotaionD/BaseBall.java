package com.ncu.mavenSpring.AnnotaionD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("BBCoach")
public class BaseBall implements ICoach {
	private IFortune ifortune;
	
	
	public IFortune getIfortune() {
		return ifortune;
	}
	@Autowired	
	@Qualifier("restFortune")//Qualifier with constructor
	public void setIfortune( IFortune ifortune) {
		this.ifortune = ifortune;
		System.out.println("in BaseBall setter method");
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
