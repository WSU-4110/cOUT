package com.cout.incognito.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cout.incognito.models.Answer;
import com.cout.incognito.models.Question;
import com.cout.incognito.repository.AnswerRepository;
import com.cout.incognito.services.AnswerService;

@Controller
public class AnswerDisplayController {
	
	@Autowired
	private AnswerRepository answerRepository;
	
	@Autowired
	private AnswerService aService;


	@GetMapping("/answeredQuestion")
	public String redirectAnswer() {
		return "answeredQuestion";
	}
	@RequestMapping(value="answeredQuestion", method={RequestMethod.POST})
	@ModelAttribute("Answer")
	public void saveAnswer(Answer answer) {
		aService.saveAnswer(answer);
	}


	
}
