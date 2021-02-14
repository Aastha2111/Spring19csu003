package com.ncu.string_primitiveType;

public  class OracleDAO implements IDAO{
	
	private int n;
	private String s;
	private int z;

	public OracleDAO()					//make all constructor public to access
	{
//	System.out.println("this is demo call from oracle");
		System.out.println("Oracle Default Cons Call");

	}
	
	public OracleDAO(int n)
	{
		 this.n=n;
//		 System.out.println("calling to number"+n);
		 System.out.println("I am AA Constr Call");

		
	}
    
	public OracleDAO(String s,int z)
	{
		 
//		 System.out.println("hello "+s+"your number"+z);
		 System.out.println("I am AA Constr Call "+s+" "+z);

		
	}
	public void create()
	{
		System.out.println("Oracle DAO Create X is "+n);

	}
	
	public void read()
	{
		System.out.println("reading ");

	}
	
}
