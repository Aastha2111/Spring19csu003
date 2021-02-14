package com.ncu.LCProducer;

import java.util.ResourceBundle;

public class FactoryProducer {
	private static ResourceBundle rb = ResourceBundle.getBundle("config");
			private void FactoryProducer() {}
			//function for getting object of the class given in file config.properties
			static IProducer getObject()      //static====want to access direct with the class name in te main
			{
			Object object = null;    // inastantiate the object of class passed in the config file
			
			//fetching the class name from key value pair given in getString method
			String className = rb.getString("classname");
			try {
			//creating the object for the class name value
			object = Class.forName(className).getDeclaredConstructor().newInstance();
			                                       //getDeclaredConstructor().newInstance();====get the object the class
			}catch(Exception e) {
			}//object creation required exception handling
			return (IProducer)object;
}}


///config.prop file ==NON COMPILATION FILE
// BEAN BENEFITS====NON COMPLATION FILE