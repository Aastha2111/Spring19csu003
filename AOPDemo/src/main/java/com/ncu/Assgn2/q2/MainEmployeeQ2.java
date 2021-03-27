package com.ncu.Assgn2.q2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainEmployeeQ2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//aastha-19csu003
				ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
				Employee emp =context.getBean(Employee.class);
				EmployeeService empService =context.getBean(EmployeeService.class);
				empService.addEmployee(emp);
				empService.getEmployeewithId(new Long(13));
				System.out.println(emp);
				((AnnotationConfigApplicationContext)context).close();
	}

}
