package com.cout.incognito.controller;

import com.cout.incognito.models.Answer;
import com.cout.incognito.models.Question;
import com.cout.incognito.models.Student;
import com.cout.incognito.models.studentConfirmationToken;
import com.cout.incognito.repository.AnswerRepository;
import com.cout.incognito.repository.QuestionRepository;
import com.cout.incognito.services.AnswerService;
import com.cout.incognito.services.IQuestionService;
import com.cout.incognito.services.QuestionService;

import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

 

@Controller
public class QuestionDisplayController {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private AnswerRepository answerRepository;

	
	@RequestMapping(value="TeacherDash", method=RequestMethod.GET)
	public ModelAndView getQuestions() {
		List<Question> questions = (List<Question>) questionRepository.findAll();
		List<Answer> answers = (List<Answer>) answerRepository.findAll(); 
	    ModelAndView mv = new ModelAndView("TeacherDash"); 
	    mv.addObject("question", questions);
	    mv.addObject("answer", answers);
	    
	
	    return mv;
	}
	


}
