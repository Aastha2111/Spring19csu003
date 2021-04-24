package com.ncu.custController;

import javax.validation.Valid;


import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ncu.custModel.Update;
import com.ncu.custModel.Users;


@Controller
public class CustController {


//	@RequestMapping("/")
//	public String welcomemsg(Model model) {
////		model.addAttribute("msg", "hello world");
//		return "index";
//	}
	

//	@InitBinder
//	public void initBinder(WebDataBinder dataBinder) {
//		
//		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
//		
//		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
//	}
	
	@RequestMapping("/")
	public String helloMsg()
	{
		return "welcome";
	}
	
	

//	
	@RequestMapping("/reg")
	public String Home(Model model) {
		model.addAttribute("UserModel", new Users());
		
		return "client";
	}
	@RequestMapping(path = "/login",method = RequestMethod.POST)
	public String doLogin(@Valid @ModelAttribute("UserModel") Users use,BindingResult theBindingResult) 
	 
//	public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer,
//			BindingResult theBindingResult){}
	
	{
		
		
//			model.addAttribute("Name", use.getUserid());
//			model.addAttribute("LName", use.getLname());		
//			model.addAttribute("Email", use.getEmail());
//			model.addAttribute("Password", use.getPwd());
//			model.addAttribute("Contact", use.getPhno());
//			model.addAttribute("Gender", use.getGender());
//			model.addAttribute("Address", use.getAddr());
//			model.addAttribute("State", use.getState());
//			model.addAttribute("Country", use.getCountry());
		

		System.out.println("Name:->  "+use.getUserid()+"  ");	
		System.out.println("Name:->  "+use.getLname()+"  ");
		System.out.println("Email:->  "+use.getEmail()+"  ");	
		System.out.println("Password:->  "+use.getPwd()+"  ");	
		
		System.out.println("Age:->  "+use.getPhno()+"  ");	
		System.out.println("Gender:->  "+use.getGender()+"  ");	
		System.out.println("Area:->  "+use.getAddr()+"  ");	
		System.out.println("State:->  "+use.getState()+"  ");	
		System.out.println("Country:->  "+use.getCountry()+"  ");	
	
		
			if (theBindingResult.hasErrors()) {
				return "client";
			}
			else {
				return "loginsuccess";
			}
		
	}
	
	
//	@RequestMapping("/upd")
//	public String Home2(Model model) {
//		model.addAttribute("UpdateModel", new Update("aastha","madaan","aastha19csu003@gmail.com","aastha",123456789,"female","karol Bagh","delhi","India"));
//		
//		return "update";
//	}
//	
//	
//	@RequestMapping(path = "/final",method = RequestMethod.POST)
//	public String doLogin(@ModelAttribute("UpdateModel") Update upd , Model model) {
//			
//			model.addAttribute("Name", upd.getUserid());
//			model.addAttribute("LName", upd.getLname());
//		
//			model.addAttribute("Email", upd.getEmail());
//			model.addAttribute("Password", upd.getPwd());
//			model.addAttribute("Contact", upd.getPhno());
//			model.addAttribute("Gender", upd.getGender());
//			model.addAttribute("Address", upd.getAddr());
//			model.addAttribute("State", upd.getState());
//			model.addAttribute("Country", upd.getCountry());
//		
//		return "fullsuccess";
//	}
//	
	

	
	
}
