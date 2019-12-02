package com.cout.incognito.controller;

import com.cout.incognito.models.Answer;
import com.cout.incognito.models.Question;
import com.cout.incognito.repository.AnswerRepository;
import com.cout.incognito.repository.QuestionRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

 
@Component
@Controller
public class QuestionDisplayController {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private AnswerRepository answerRepository;

	
	@RequestMapping(value="/teacherMessageBoard", method=RequestMethod.GET)
	public ModelAndView getQuestions() {
		List<Question> questions = (List<Question>) questionRepository.findAll();
		List<Answer> answers = (List<Answer>) answerRepository.findAll(); 
	    ModelAndView mv = new ModelAndView("teacherMessageBoard"); 
	    mv.addObject("question", questions);
	    mv.addObject("answer", answers);
	    
	
	    return mv;
	}
	


}
