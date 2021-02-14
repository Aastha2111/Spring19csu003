package com.ncu.LCProducer;

public class Consumer {
 
	IProducer producer;
	public Consumer(IProducer producer){
//		this producer = producer ;
		this.producer =producer;
		
	}
	public void ConsumerFirst()
	{
		this.producer.first();
	}	
}



