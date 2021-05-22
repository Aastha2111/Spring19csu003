package com.ncu.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ncu.crud.dao.StudDao;
import com.ncu.crud.model.Student;

@Controller
public class StudController {
	 @Autowired    
	    StudDao dao;//will inject dao from XML file    
	        
	 @RequestMapping("/")
	   public String index() {
		 
		   return "index";
	   }
	 
	    /*It displays a form to input data, here "command" is a reserved request attribute  
	     *which is used to display object data into form  
	     */    
	    @RequestMapping("/StudForm")    
	    public String showform(Model m){    
	        m.addAttribute("command", new Student());  
	        return "StudForm";   
	    }    
	    /*It saves object into database. The @ModelAttribute puts request data  
	     *  into model object. You need to mention RequestMethod.POST method   
	     *  because default request is GET*/    
	    @RequestMapping(value="/save",method = RequestMethod.POST)    
	    public String save(@ModelAttribute("stud") Student stud){    
	        dao.save(stud);    
	        return "redirect:/viewStud";//will redirect to viewemp request mapping    
	    }    
	    /* It provides list of employees in model object */    
	    @RequestMapping("/viewStud")    
	    public String viewemp(Model m){    
	        List<Student> list=dao.getEmployees();    
	        m.addAttribute("list",list);  
	        return "viewStud";    
	    }    
	    /* It displays object data into form for the given id.   
	     * The @PathVariable puts URL data into variable.*/    
	    @RequestMapping(value="/editemp/{id}")    
	    public String edit(@PathVariable int id, Model m){    
	        Student stud=dao.getEmpById(id);    
	        m.addAttribute("command",stud);  
	        return "StudeditForm";    
	    }    
	    /* It updates model object. */    
	    @RequestMapping(value="/editsave",method = RequestMethod.POST)    
	    public String editsave(@ModelAttribute("emp") Student stud){    
	        dao.update(stud);    
	        return "redirect:/viewStud";    
	    }    
	    /* It deletes record for the given id in URL and redirects to /viewemp */    
	    @RequestMapping(value="/deleteemp/{id}",method = RequestMethod.GET)    
	    public String delete(@PathVariable int id){    
	        dao.delete(id);    
	        return "redirect:/viewStud";    
	    }     
	
}
