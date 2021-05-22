package com.ncu.customValid.Validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class codeCustConstrainValidator implements ConstraintValidator<MyCourseCode, String> {
	private String[] coursePrefix;
	@Override
	public void initialize(MyCourseCode theCourseCode) {
		// TODO Auto-generated method stub
		coursePrefix=theCourseCode.value();
		System.out.println(coursePrefix);
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
				
//		boolean result;
//		if(value!=null) {
//			result=value.startsWith(coursePrefix);
//		}
//		else {
//			result=true;
//		}
//		
//		return result;
//	}
		//accepting array
		boolean result=false;
		if(value!=null) {
			//LOOP THROUGH THE COURSE PRIFIX
			// check to see if code matches any of the course prefixes
			for(String tempPrefix : coursePrefix) {
				result=value.startsWith(tempPrefix);
				if(result) {break;}
				}
				}
		else {
			result=true;
		}
		
		return result;
	}	
	

}