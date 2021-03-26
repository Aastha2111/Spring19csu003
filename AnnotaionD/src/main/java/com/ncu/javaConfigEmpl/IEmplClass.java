package com.ncu.javaConfigEmpl;

import org.springframework.beans.factory.annotation.Autowired;

public class IEmplClass {
//implement the Employee interface to call it in the main class directly
	// trying to implement the @Primary Annotation
	

    @Autowired
    private IEmployee iemployee;

    public IEmployee EmployeeName() {
        return iemployee;
    }
}
