package com.cout.incognito.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cout.incognito.models.Student;
import com.cout.incognito.models.Teacher;
import com.cout.incognito.models.studentConfirmationToken;
import com.cout.incognito.models.teacherConfirmationToken;
import com.cout.incognito.repository.studentConfirmationTokenRepo;
import com.cout.incognito.repository.studentRepo;
import com.cout.incognito.repository.teacherConfirmationTokenRepo;
import com.cout.incognito.repository.teacherRepo;

@Component
@Controller 
public class incognitoController {
	
	@Autowired
	private studentConfirmationTokenRepo studentConfirmationTokenRepository;
	
	@Autowired
	private teacherConfirmationTokenRepo teacherConfirmationTokenRepository;
	
	@Autowired
	private studentRepo studentRepository;
	
	@Autowired
	private teacherRepo teacherRepository;
	
	
	@RequestMapping("/")
	public String welomcePage(){
		return "index";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginHome(){
		return "login";
	}
	
	@RequestMapping("/TeacherDash")
	public String teacherDash(HttpServletRequest request){
		request.setAttribute("mode","MODE_HOME");
		return "TeacherDash";
	}
	
	@RequestMapping("/logout")
	public String logout(){
		return "logout";
	}
	
	@RequestMapping(value="/confirm-student-account", method= {RequestMethod.GET, RequestMethod.POST})
	public String confirmStudentAccount(@RequestParam("token")String studentConfirmationToken)
	{
	    studentConfirmationToken token = studentConfirmationTokenRepository.findByConfirmationToken(studentConfirmationToken);

	    if(studentConfirmationToken != null)
	    {
	        Student student = studentRepository.findByEMAILIgnoreCase(token.getStudent().getEMAIL());
	    		
		        student.setEnabled(true);
		        studentRepository.save(student);
		        return "redirect:";
	    }
	    else
	    {
	        return "linkbroken";
	    }

	}
	@RequestMapping(value="/confirm-teacher-account", method= {RequestMethod.GET, RequestMethod.POST})
	public String confirmTeacherAccount(@RequestParam("token")String teacherConfirmationToken)
	{
	    
		teacherConfirmationToken token = teacherConfirmationTokenRepository.findByConfirmationToken(teacherConfirmationToken);

	    if(teacherConfirmationToken != null)
	    {
	        Teacher teacher = teacherRepository.findByEMAILIgnoreCase(token.getTeacher().getEMAIL());
	    		
		        teacher.setEnabled(true);
		        teacherRepository.save(teacher);
		        return "redirect:";
	    }
	    else
	    {
	        return "linkbroken";
	    }

	}


	


} 
