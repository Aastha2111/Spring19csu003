package com.ncu.LC;

public class Manager {
	
	Iworker worker; //Interface Object
	public Manager(Iworker worker) //construvtor
	{ 
	this.worker=worker; 
	} 
	public void ManageWork() //calling work funtion of IWorker 
	{ 
	this.worker.work(); 
	} 
	

}
