package com.cout.incognito.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.cout.incognito.models.Answer;
import com.cout.incognito.models.Question;
import com.cout.incognito.services.AnswerService;

@Component
@Controller
public class AnswerDisplayController {
	
	@Autowired
	private AnswerService aService;

	@Autowired
	private Answer answer;

	@GetMapping("/answeredQuestion")
	public String redirectAnswer() {
		return "answeredQuestion";
	}
	@RequestMapping(value="answeredQuestion", method={RequestMethod.POST})
	public void saveAnswer(Question question) {
		aService.saveAnswer(answer);
		new Answer(question);
	}
	
}
