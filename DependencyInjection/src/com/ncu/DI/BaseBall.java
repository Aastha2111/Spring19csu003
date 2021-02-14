package com.ncu.DI;

public class BaseBall implements ICoach {
//	public void workout()
//	{
//    System.out.println("let's play BAseBall Today");
//	}
	
	private IFortune ifortune;
	
	public BaseBall(IFortune ifortune)
	{
		this.ifortune=ifortune;
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
