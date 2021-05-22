package com.ncu.SessionDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ncu.SessionDemo.dao.MyUserDao;
import com.ncu.SessionDemo.model.SessionUsers;

@Controller
@SessionAttributes("user")
public class LoginController {

	@Autowired
	private MyUserDao userdao;
	
	@ModelAttribute("user")
	   public SessionUsers setUpUserForm() {
	      return new SessionUsers();
	   }

	   @RequestMapping("/")
	   public String index(Model model) {
	     model.addAttribute("user", new SessionUsers());
		   return "index";
	   }

//	   @RequestMapping(value="/dologin", method=RequestMethod.GET)
//	@PostMapping()
	
	@GetMapping(value="/dologin")   
	public String doLogin(@ModelAttribute("user") SessionUsers user, Model model) {

		 String email=user.getEmail();
		 
			 
	      // Implement your business logic
	      if (user.getEmail().equals("aastha@gmail.com") && user.getPassword().equals("aastha@123")) {
	         // Set user dummy data
	        System.out.println(user.getEmail());
//	        user=userdao.get(email);   //error
	        SessionUsers obj= new SessionUsers();
	         obj=userdao.get(email);
	        
	        System.out.println(obj.getFname());
//	    	  user.setFname("aastha");
//	         user.setMname(" ");
//	         user.setLname("madaan");
	         user.setAge(20);
	         model.addAttribute("user",obj);
	      } else {
	         model.addAttribute("message","Incorrect Logins. Try again.");
	         System.out.println("login failed");
	         return "index";
	      }
	      return "success";
	   }
	
	
	  @RequestMapping(value="/test", method = RequestMethod.GET)
		 public String userInfo(@SessionAttribute("user") SessionUsers user) {

		      System.out.println("Email: " + user.getEmail());
		      System.out.println("First Name: " + user.getFname());

		      return "test";
		   }
	   @RequestMapping(value="/edit/{id}", method = RequestMethod.GET)
		 public String dbInfo( @PathVariable("id") String id, @ModelAttribute("user") SessionUsers user, Model model) {
		 
//		   String email=user.getEmail();
		      System.out.println("id: " + id);
		      System.out.println("First Name: " + user.getFname());

		      user=userdao.get(id);
		      model.addAttribute(user);
		      return "database";
		   }
	
}
