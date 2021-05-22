package com.ncu.customValid.Validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PassCustConstrainValidation implements ConstraintValidator<MyPassword,String> {

	private String pwdcheck;
	@Override
	public void initialize(MyPassword thepwd) {
		// TODO Auto-generated method stub
		pwdcheck = thepwd.value();
		System.out.println(pwdcheck);
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		
		char c = value.charAt(0);
		 boolean result=false;
	        String inputString = value;
	        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
	        Matcher matcher = pattern.matcher(inputString);
	        boolean isStringContainsSpecialCharacter = matcher.find();
	        if(isStringContainsSpecialCharacter)
	        {	result=Character.isUpperCase(c);
	        }
	        else
	            result = false;

	        return result;
		
//		boolean result;
//        char c = value.charAt(0);

//		if(value!=null) {
			
//			Must contain at least one digit
//			Must contain at least one of the following special characters @, #, $
//			The length should be between 6 to 20 characters.
			
//			result=value.startsWith("M");
//			result=(value.matches(".*[0-9]{1,}.*") && value.matches(".*[@#$]{1,}.*") && value.length()>=6 && value.length()<=20);
//			((?=.*\d)(?=.*[A-Z])(?=.*\W).{8,8})
			
			
			
//			 result=Character.isUpperCase(c)&&value.matches("(?=.[0-9]).+")  && value.matches("(?=.[a-z]).+") 
//					 && value.matches("(?=.*[A-Z]).+")&& (value.length() > 8)&& value.matches(".[@#$]{1,}.");
//			 		}
//		else {
//			result=true;
//		}
//		
//		return result;
//	}
			
		
}}
