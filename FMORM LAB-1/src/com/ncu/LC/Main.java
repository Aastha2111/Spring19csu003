package com.ncu.LC;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
			Iworker sw = new SmartWorker(); //Upcasting 
			Manager mn = new Manager(sw); //passing smartworker object
			mn.ManageWork();
			Iworker lw = new LazyWorker(); //Upcasting 
			Manager mn2 = new Manager(lw);//passing lazyworker object
			mn2.ManageWork(); 
			Iworker ew = new ExtraOrdinary(); //Upcasting 
			Manager mn3 = new Manager(ew); //passing extraordinaryworker object
			mn3.ManageWork(); 
			*/
		
		
		// Stop creating objects in main class and assign this task to another class- FACTORY CLASS

		Iworker sw = Factory.getObject() ;
		Manager mn = new Manager(sw); //passing smartworker object
		mn.ManageWork();
		}

			
	}


