package com.cout.incognito.controller;

import com.cout.incognito.models.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.cout.incognito.services.QuestionServiceImpl;

@Controller
@RequestMapping("/questions")
public class QuestionDisplayController {
	@Autowired
	private Question question;
	@Autowired 
	private QuestionServiceImpl questionService;

	
	
	public String questionIndex(ModelMap modelMap){
		modelMap.put("questions", questionService.find(question.getID()));
		return "TeacherDash";
		}

}
