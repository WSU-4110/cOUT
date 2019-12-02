package com.cout.incognito.controller;
import java.util.Random;

import com.cout.incognito.models.Answer;
import com.cout.incognito.models.Courses;
import com.cout.incognito.models.Question;
import com.cout.incognito.models.User;
import com.cout.incognito.repository.AnswerRepository;
import com.cout.incognito.repository.CoursesRepo;
import com.cout.incognito.repository.QuestionRepository;
import com.cout.incognito.repository.UserRepo;
import com.cout.incognito.services.CoursesService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

 
@Component
@Controller
public class AddClassController {
	
	@Autowired
	public UserRepo userRepo;
	
	Random rand = new Random();
	
	@Autowired
	private CoursesService coursesService;
	
	@RequestMapping(value="/addCourse", method=RequestMethod.POST)
	public String saveCourses(Courses course, User user, String crsName) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String name = auth.getName();
		user = userRepo.findByEMAILIgnoreCase(name);
		//int accessCode = rand.nextInt(100000)+100000;
		course = new Courses(user, crsName);
		coursesService.saveCourse(course);
			
	    return "redirect:/teacherDash";
	}
	
}
