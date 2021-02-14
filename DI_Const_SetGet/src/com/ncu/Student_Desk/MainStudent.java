package com.ncu.Student_Desk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStudent {
	public static void main(String args[])
	{
		ApplicationContext ct=new ClassPathXmlApplicationContext("springStudent_Desk.xml");
		Student st=(Student)ct.getBean("stud");
		System.out.println(st.toString());
		st.CourseDetails();
	}

}
