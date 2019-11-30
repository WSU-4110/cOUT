package com.cout.incognito.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@Controller 
public class incognitoController {
	
	@RequestMapping("/")
	public String welomcePage(){
		return "index";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginHome(){
		return "login";
	}
	
	@RequestMapping(value="/studentDash", method=RequestMethod.GET)
	public String studentDash(){
		return "studentDash";
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

	@RequestMapping("/TeacherDash")
	public String teacherDash(HttpServletRequest request){
		request.setAttribute("mode","MODE_HOME");
		return "TeacherDash";
	}
	
	@RequestMapping("/logout")
	public String logout(){
		return "logout";
	}

} 
