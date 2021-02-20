package com.ncu.ConfigJavaFile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("BBCoach")
public class BaseBall implements ICoach {
	private IFortune ifortune;
//	private String name;
//	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public IFortune getIfortune() {
//		return ifortune;
//	}
//	@Autowired	
//	//Qualifier with constructor
//	public void setIfortune(@Qualifier("restFortune") IFortune ifortune) {
//		this.ifortune = ifortune;
//		System.out.println("in BaseBall setter method");
//	}
	@Override
	public String workout()

	{
		return "let's play BaseBall Today";
	}

	public String BBworkout()

	{
		return "only BaseBall workout";
	}
//	@Override
//	public String getFortune()
//
//	{
//		return ifortune.getFortune();
//	}

}
