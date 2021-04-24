package com.ncu.customValid.Validations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;

@Constraint(validatedBy = codeCustConstrainValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyCourseCode {

	// define default course code
//	public String value() default "CSE";
	public String[] value() default {"CSE","ECE","CSL","SOM"};
		
		// define default error message
		public String message() default "must start with CSE";
		
		// define default groups
		public Class<?>[] groups() default {};
		
		// define default payloads
		public Class<? extends Payload>[] payload() default {};
	
}
