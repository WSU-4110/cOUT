package com.cout.incognito.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cout.incognito.models.ConfirmationToken;
import com.cout.incognito.models.User;
import com.cout.incognito.repository.ConfirmationTokenRepo;
import com.cout.incognito.repository.UserRepo;
import com.cout.incognito.services.EmailSenderService;
import com.cout.incognito.services.UserService;

@Component
@Controller 
public class UserRegistrationController {
	
	@Autowired
	private UserService uService;
	
	@Autowired
	private UserRepo userRepository;
	
	@Autowired
	private ConfirmationTokenRepo confirmationTokenRepository;
	
	@Autowired
	private EmailSenderService emailSenderService;
	    
	    

		@RequestMapping(value="/registered-User", method = {RequestMethod.POST})
		public String registerUser(User user,Model model)
		{
			User existingUser = userRepository.findByEMAILIgnoreCase(user.getEMAIL());
		    if(existingUser != null)
		    {
		    	String emailError = "User already exists";
		    	model.addAttribute("emailError", emailError);
		       return "studentSU";
		    }
		    else
		    {
		    	uService.saveUser(user);
		        ConfirmationToken confirmationToken = new ConfirmationToken(user);

		        confirmationTokenRepository.save(confirmationToken);

		        SimpleMailMessage mailMessage = new SimpleMailMessage();
		        mailMessage.setTo(user.getEMAIL());
		        mailMessage.setSubject("Complete Registration!");
		        mailMessage.setFrom("TeamCOUT");
		        mailMessage.setText("To confirm your account, please click here : "
		        +"http://localhost:8080/confirm-user-account?token="+confirmationToken.getConfirmationToken());

		        emailSenderService.sendEmail(mailMessage);

		        return "redirect:";
		    }

	}

		
		@RequestMapping(value="/confirm-user-account", method= {RequestMethod.GET, RequestMethod.POST})
		public String confirmUserAccount(@RequestParam("token")String userConfirmationToken)
		{
		    ConfirmationToken token = confirmationTokenRepository.findByConfirmationToken(userConfirmationToken);

		    if(userConfirmationToken != null)
		    {
		        User user = userRepository.findByEMAILIgnoreCase(token.getUser().getEMAIL());
		    		
			        user.setEnabled(true);
			        userRepository.save(user);
			        return "redirect:/login";
		    }
		    else
		    {
		        return "linkbroken";
		    }

		}



	

}
