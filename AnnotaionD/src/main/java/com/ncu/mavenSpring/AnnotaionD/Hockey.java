package com.ncu.mavenSpring.AnnotaionD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("HHCoach")
public class Hockey implements ICoach{
	
	@Autowired //--DIRECTLY ON PROPERTY WITHOUT use of constructor and setter
	@Qualifier("restFortune")
	private IFortune ifortune;
	
	@Override
	public String workout()

	{
		return "let's play hocket Today";
	}
	@Override
	public String getFortune()

	{
		return ifortune.getFortune();
	}

}
