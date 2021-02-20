package com.ncu.ConfigJavaFile;

@Configuration    //configuration class--similar to xml file
@ComponentScan("com.ncu.ConfigJavaFile")  //to enable Annotation in ur project
public class JavaConfigFile {

	@Bean public IFortune Fortune() 
	{
		return new Fortune();
	}
	//java config  obj of any bean
	@Bean
	public ICoach BBCoach()			// bean id="BBCoach" nd casting in interface
	{
		return new BaseBall();   //class name
	}
	@Bean
	public BaseBall BCoach()	//diectly class to access those function not in interface
	{
		return new BaseBall();   
	}
	@Bean
	public CricketCoach coach() {
		return new CricketCoach("vaishali");
	}
}
