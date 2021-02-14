package com.ncu.springCoach;

public class HeadCoach {
 
	ICoach Ic;
	HeadCoach(ICoach Ic)
	{
		this.Ic=Ic;
	}
	public void CoachAssign()
	{
		Ic.play();
		}
}
