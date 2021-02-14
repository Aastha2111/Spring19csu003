package com.ncu.LCProducer;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      IProducer fp=new FastProducer();
//      Consumer cs=new Consumer(fp);
//      cs.ConsumerFirst();
//   
//		@Aastha-19csu003
		IProducer sw = FactoryProducer.getObject() ;
		Consumer mn = new Consumer(sw); //passing fisrt fast producer object
		mn.ConsumerFirst();
	}

}
