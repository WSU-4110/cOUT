package com.cout.incognito.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.cout.incognito.models.Teacher;
import com.cout.incognito.models.teacherConfirmationToken;
import com.cout.incognito.repository.teacherConfirmationTokenRepo;
import com.cout.incognito.repository.teacherRepo;
import com.cout.incognito.services.EmailSenderService;
import com.cout.incognito.services.teacherService;

@Component
@Controller
public class teacherRegistrationController {
	@Autowired
	private teacherService tService;
	
	@Autowired
	private teacherRepo teacherRepository;
	
	@Autowired
	private teacherConfirmationTokenRepo teacherConfirmationTokenRepository;
	
	@Autowired
	private EmailSenderService emailSenderService;
	    
	@RequestMapping("/teacherSU") 
	public String signup() {
		System.out.println("AppController ->teacher");
		return "teacherSU";
	}

	@RequestMapping(value="/registered-teacher", method = {RequestMethod.GET,RequestMethod.POST})
	public String registerTeacher(Teacher teacher)
	{

	    Teacher existingTeacher = teacherRepository.findByEMAILIgnoreCase(teacher.getEMAIL());
	    if(existingTeacher != null)
	    {
	       return "linkbroken";
	    }else
	    {
	    	tService.saveTeacher(teacher);
	        teacherConfirmationToken confirmationToken = new teacherConfirmationToken(teacher);

	        teacherConfirmationTokenRepository.save(confirmationToken);

	        SimpleMailMessage mailMessage = new SimpleMailMessage();
	        mailMessage.setTo(teacher.getEMAIL());
	        mailMessage.setSubject("Complete Registration!");
	        mailMessage.setFrom("TeamCOUT");
	        mailMessage.setText("To confirm your account, please click here : "
	        +"http://localhost:8080/confirm-teacher-account?token="+confirmationToken.getConfirmationToken());

	        emailSenderService.sendEmail(mailMessage);

	        return "redirect:/";
	    }

	}

	

	

}
