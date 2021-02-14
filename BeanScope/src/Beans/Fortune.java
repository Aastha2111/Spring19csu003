package Beans;

public class Fortune implements IFortune {
	public Fortune()
	{
		System.out.println("fortune constructor");
	}
	 public String getFortune()
	 {
		return "good fortune today!";
	 }
      
}
