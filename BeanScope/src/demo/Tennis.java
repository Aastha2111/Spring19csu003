package demo;

public class Tennis implements ICoach {
//	public void workout()
//	{
//    System.out.println("let's play BAseBall Today");
//	}
	
//	private IFortune ifortune
	private  String coachName;
	
	@Override
//	public String toString() {
//		return "Tennis [CoachName=" + coachName + "]";
//	}
	public String getCoachName() {
		return coachName;
	}
	public void setCoachName(String coachName) {
		this.coachName = coachName;
		}
//	}
//	public Tennis(IFortune ifortune)
//	{
//		this.ifortune=ifortune;
//	}
//	@Override
//	public String workout()
//
//	{
//		return "let's play Tennis Today";
//	}
//	@Override
//	public String getFortune()
//
//	{
//		return ifortune.getFortune();
////	}
//	@Override
//	public String getFortune() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
