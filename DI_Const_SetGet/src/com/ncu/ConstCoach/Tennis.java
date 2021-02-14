package com.ncu.ConstCoach;

public class Tennis implements ICoach {
//	public void workout()
//	{
//    System.out.println("let's play BAseBall Today");
//	}
	
	private IFortune ifortune;
	
	public Tennis(IFortune ifortune)
	{
		this.ifortune=ifortune;
	}
	@Override
	public String workout()

	{
		return "let's play Tennis Today";
	}
	@Override
	public String getFortune()

	{
		return ifortune.getFortune();
	}

}
