package com.cout.incognito.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cout.incognito.models.studentConfirmationToken;
import com.cout.incognito.models.Student;
import com.cout.incognito.repository.studentConfirmationTokenRepo;
import com.cout.incognito.repository.studentRepo;
import com.cout.incognito.services.EmailSenderService;
import com.cout.incognito.services.studentService;

import com.cout.incognito.models.Teacher;
import com.cout.incognito.models.teacherConfirmationToken;
import com.cout.incognito.repository.teacherConfirmationTokenRepo;
import com.cout.incognito.repository.teacherRepo;
import com.cout.incognito.services.EmailSenderService;
import com.cout.incognito.services.teacherService;

@Controller 
public class studentMsgBoardController {

	@Autowired
	private studentService sService;
	
	@Autowired
	private studentRepo studentRepository;
	
	@Autowired
	private EmailSenderService emailSenderService;
	    
	@RequestMapping("/studentMsgBoardController") 
	public String signup() {
		System.out.println("AppController -> student");
		return "studentMsgBoardController";
	}

/*	@RequestMapping(value="/nudge-question", method = {RequestMethod.POST})
	public String nudge(Teacher teacher)
	{

	   if(nudge) 
	   {
	    	tService.saveTeacher(teacher);
	    	
	    	SimpleMailMessage mailMessage = new SimpleMailMessage();
	    	mailMessage.setTo(teacher.getEMAIL());
	    	mailMessage.setSubject("Student has Nudged a Question!");
	    	mailMessage.setFrom("TeamCOUT");
	    	mailMessage.setText("A student has nudged a question, please check your message board to answer or delete the question");

	    	emailSenderService.sendEmail(mailMessage);

	    	return "index1";
	    }

	 }	
	 */

}
