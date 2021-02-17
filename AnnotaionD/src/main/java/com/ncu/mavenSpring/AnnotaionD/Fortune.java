package com.ncu.mavenSpring.AnnotaionD;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Fortune implements IFortune {
//	private Random random = new Random();
//    public String getFortune() {
//    List<String> fortune = new ArrayList<String>();
//    fortune.add("you will this match");
//    fortune.add("sorry!! u may lose this match");
//    fortune.add("you are lucky today");
//    fortune.add("Don't lose ur hope");
//   
//    Fortune  obj = new Fortune ();
//   
//    return obj.getRandomList(fortune);
//  
//	
//}
//    public String getRandomList(List<String> list) 
//	   {     int index = random.nextInt(list.size());
//	          return list.get(index);
//	 
//	   }
      public String getFortune() {
    	  
    	  FileReader fr = null;
		try {
			fr = new FileReader("C:\\Users\\K L Madaan\\Desktop\\ncu sem-3\\EWA\\eclipse-jee\\AnnotaionD\\src\\main\\resource\\AnnotationFortune");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}    
          BufferedReader br=new BufferedReader(fr);
          ArrayList<String> fort=new ArrayList<>();
          String f=null;
          try {
			f=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          while(f!=null)
          {
        	  fort.add(f);
        	  try {
				f=br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
          }
          try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          try {
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
           Random random = new Random();
          int index = random.nextInt(fort.size());
          return fort.get(index);
          
      }
}
