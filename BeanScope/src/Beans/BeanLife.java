package Beans;

public class BeanLife implements ICoach {
private IFortune ifortune; //fortune inject
	
	public BeanLife() {
		System.out.println("Bean life-constructor");   //bean instantiation
	}
	
	@Override	
	public String workout() {
		// TODO Auto-generated method stub
		return "let's start our workout";
	}

	public IFortune getIfortune() {
		return ifortune;
	}

	public void setIfortune(IFortune ifortune) {           
		System.out.println("Beanlife: setter method-setFortune");
		this.ifortune = ifortune;
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return ifortune.getFortune();
	}
	public void doStartup()     //no agrument method-no return type (VOID) 
	{
		System.out.println("init(Startup) method calling ");
	}
	public void doCleanup() {
		System.out.println("Destroy(CleanUp) method call");
	}

}
