package com.ncu.ConfigJavaFile;



import org.springframework.stereotype.Component;

@Component
public class Fortune implements IFortune {

         public String getFortune()
         {
        	 return "in fortune class";
         }
}
