package com.ncu.SessionDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ncu.SessionDemo.model.SessionUsers;

@Controller
public class UserController {


	@RequestMapping(value="/info", method = RequestMethod.GET)
	 public String userInfo(@SessionAttribute("user") SessionUsers user) {

	      System.out.println("Email: " + user.getEmail());
	      System.out.println("First Name: " + user.getFname());

	      return "user";
	   }
	@RequestMapping(value="/info2", method = RequestMethod.GET)
	 public String userInfo1(@SessionAttribute("user") SessionUsers user) {

	      System.out.println("Email: " + user.getEmail());
	      System.out.println("First Name: " + user.getFname());

	      return "test";
	   }
}
