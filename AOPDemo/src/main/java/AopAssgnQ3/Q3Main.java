package AopAssgnQ3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Q3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Q3Config.class);
        Employee employee = (Employee) ac.getBean("employee");
        employee.setName("aastha-19csu003");
        System.out.println(employee.getName());
	}

}
