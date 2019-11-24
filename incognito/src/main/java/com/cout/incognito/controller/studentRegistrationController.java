package com.cout.incognito.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.cout.incognito.models.studentConfirmationToken;
import com.cout.incognito.models.Student;
import com.cout.incognito.repository.studentConfirmationTokenRepo;
import com.cout.incognito.repository.studentRepo;
import com.cout.incognito.services.EmailSenderService;
import com.cout.incognito.services.studentService;

@Component
@Controller 
public class studentRegistrationController {

	@Autowired
	private studentService sService;
	
	@Autowired
	private studentRepo studentRepository;
	
	@Autowired
	private studentConfirmationTokenRepo studentConfirmationTokenRepository;
	
	@Autowired
	private EmailSenderService emailSenderService;
	    
	@RequestMapping("/studentSU") 
	public String signup() {
		System.out.println("AppController -> student");
		return "studentSU";
	}

	@RequestMapping(value="/registered-student", method = {RequestMethod.POST})
	public String registerStudent(Student student)
	{

	    Student existingStudent = studentRepository.findByEMAILIgnoreCase(student.getEMAIL());
	    if(existingStudent != null)
	    {
	       return "linkbroken";
	    }
	    else
	    {
	    	sService.saveStudent(student);
	        studentConfirmationToken confirmationToken = new studentConfirmationToken(student);

	        studentConfirmationTokenRepository.save(confirmationToken);

	        SimpleMailMessage mailMessage = new SimpleMailMessage();
	        mailMessage.setTo(student.getEMAIL());
	        mailMessage.setSubject("Complete Registration!");
	        mailMessage.setFrom("TeamCOUT");
	        mailMessage.setText("To confirm your account, please click here : "
	        +"http://localhost:8080/confirm-student-account?token="+confirmationToken.getConfirmationToken());

	        emailSenderService.sendEmail(mailMessage);

	        return "redirect:";
	    }

	}
    


	

	

}
