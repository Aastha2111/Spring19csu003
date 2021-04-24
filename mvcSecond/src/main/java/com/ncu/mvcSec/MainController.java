package com.ncu.mvcSec;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ncu.mvcModel.Users;

@Controller
public class MainController {

//	@RequestMapping("/home")
//	public String Home() {
//		return "home-page";
//	}
//	@RequestMapping(path = "/login",method = RequestMethod.GET)
//	public String doLogin(@RequestParam("userid") String uid, @RequestParam("pwd") String password, Model model) {
//	if(uid.equals(password)) {
//	model.addAttribute("msg", "Hello  "+uid);
//	}
//	else {
//	model.addAttribute("msg", "Invalid Userid or Password");
//	}
//	return "/login";
//	}

	//09-04-21
//	request param
//	@RequestMapping("/index")
//	public String index() {
//		return "index";
//	}
//							//INTIALY IT IS TAKING NULL
//	@RequestMapping("/login")
//	public String doLogin(@RequestParam(required = false, name = "userid") String userId, Model model) {
//	model.addAttribute("msg", "login "+userId);//send data on login jsp
//	return "login";
//	}
	
	//model attribute 09-04-21
	@RequestMapping("/home")
	public String Home(Model model) {
		model.addAttribute("userModel",new Users("Aastha","sy"));
		return "home-page";
	}
	
	//MODEL ATTRIBUTE
	@RequestMapping(path = "/loginModelAttribute",method = RequestMethod.POST)
	public String doLogin(@ModelAttribute("userModel") Users user , Model model) {
	model.addAttribute("user_id",user.getUserid());
	
	return "loginModelAttribute";
	}

	}

	
	
//	public String logIn() {
//		return "login";
//	}
//	

