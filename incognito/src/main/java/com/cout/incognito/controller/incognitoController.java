package com.cout.incognito.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cout.incognito.models.Courses;
import com.cout.incognito.models.User;
import com.cout.incognito.repository.CoursesRepo;
import com.cout.incognito.repository.UserRepo;

@Component
@Controller 
public class incognitoController implements ErrorController {
	@Autowired
	public UserRepo userRepo;
	
	@Autowired
	private CoursesRepo coursesrepo;
	
	@RequestMapping("/")
	public String welomcePage(){
		return "index";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginHome(){
		return "login";
	}
	
	@RequestMapping(value="/studentMessageBoard", method=RequestMethod.GET)
	public String studentMessageBoard(){
		return "studentMessageBoard";
	}
	
	@RequestMapping(value="/studentDash", method=RequestMethod.GET)
	public ModelAndView studentDash(ModelMap model){
	   Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	   String name = auth.getName();
	   User userName = userRepo.findByEMAILIgnoreCase(name);
	   model.addAttribute("name", userName.getNAME());
	   List<Courses> courses = (List<Courses>) coursesrepo.findByUser_ID(userName.getID());
	   ModelAndView mv = new ModelAndView("studentDash"); 
	   if(courses !=null) {
		   mv.addObject("courses", courses);	
	   }
    
	   return mv;
	}
	
	@RequestMapping(value="/teacherDash", method=RequestMethod.GET)
	public ModelAndView teacherDash(ModelMap model){
	   Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	   String name = auth.getName();
	   User userName = userRepo.findByEMAILIgnoreCase(name);
	   model.addAttribute("name", userName.getNAME());
	   List<Courses> courses = (List<Courses>) coursesrepo.findByUser_ID(userName.getID());
	   ModelAndView mv = new ModelAndView("teacherDash"); 
	   if(courses !=null) {
		   mv.addObject("courses", courses);	
	   }
    
	   return mv;
	}
	
	@RequestMapping("/studentSU") 
	public String studentSignup() {
		System.out.println("AppController -> student");
		return "studentSU";
	}
	
	@RequestMapping("/teacherSU") 
	public String teacherSignup() {
		System.out.println("AppController ->teacher");
		return "teacherSU";
	}
	
	@RequestMapping("/logout")
	public String logout(){
		return "logout";
	}

	@RequestMapping(value="/access-denied", method=RequestMethod.GET)
	public String accessDenied(){
		return "access-denied";
	}
	@RequestMapping("/error")
	public String errorPage(){
		return "error";
	}
	
	@Override
	public String getErrorPath() {
		return "/error";
	}

} 
