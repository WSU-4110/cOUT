package com.cout.incognito.controller;
import java.util.Random;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import com.cout.incognito.models.Answer;
import com.cout.incognito.models.Courses;
import com.cout.incognito.models.Question;
import com.cout.incognito.models.User;
import com.cout.incognito.repository.AnswerRepository;
import com.cout.incognito.repository.CoursesRepo;
import com.cout.incognito.repository.QuestionRepository;
import com.cout.incognito.repository.UserRepo;
import com.cout.incognito.services.CoursesService;
import com.cout.incognito.services.QuestionService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

 
@Component
@Controller
public class CourseController {

	@Autowired
	public UserRepo userRepo;
	
	Random rand = new Random();
	
	@Autowired
	private CoursesRepo courseRepository;
	
	@Autowired
	private CoursesService coursesService;
	
	@Autowired
	private QuestionService questionService;
	
	@Autowired
	private QuestionRepository questionRepository;
	
	
	
	@RequestMapping(value="/addCourse", method=RequestMethod.POST)
	public String saveCourses(Courses course, String crsName) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String name = auth.getName();
		User userName = userRepo.findByEMAILIgnoreCase(name);
		int accessCode = rand.nextInt(100000)+100000;
		List<User> newUser = userRepo.findByID(userName.getID());
		course = new Courses(crsName, accessCode, newUser);
		coursesService.saveCourse(course);
			
	    return "redirect:/teacherDash";
	}
	
	
	@RequestMapping(value= "/teacherMessageBoard/courses/{accessCode}/questions/{id}")
	public ModelAndView getQuestions(@PathVariable int accessCode, @PathVariable int id) {
		Courses course = coursesService.getCourseByAccessCode(accessCode);
		Question question = questionService.getQuestionsById(id);
		accessCode = course.getAccessCode();
		id = question.getId();
		
		ModelAndView mv = new ModelAndView("teacherMessageBoard");
		mv.addObject("question", question.getQUESTION());
		mv.addObject("course", course.getCrsName());
		
		return mv;
		
		}
	@RequestMapping(value= "/teacherMessageBoard/courses/{accessCode}")
	public ModelAndView getQuestions(@PathVariable int accessCode) {
		Courses course = coursesService.getCourseByAccessCode(accessCode);
		List<Question> question = (List<Question>) questionRepository.findByCourse_crsId(course.getCrsId());
		accessCode = course.getAccessCode();
		
		ModelAndView mv = new ModelAndView("teacherMessageBoard");
		mv.addObject("question", question);
		mv.addObject("course", course);
		
		return mv;
		
		}
	
	@RequestMapping(value="/answeredQuestion", method=RequestMethod.POST)
	public String answerQuestionTeacher(@RequestParam int questionId, @RequestParam String answerQuestion, @RequestParam int accessCode) {
			Question question = questionRepository.findById(questionId);
			question.setANSWER(answerQuestion);
			question.setIs_answered(true);
			questionRepository.save(question);
		
		return "redirect:/teacherMessageBoard/courses/"+accessCode;
		
	}
	
	@RequestMapping(value="/askQuestion", method=RequestMethod.POST)
	public String askQuestion( @RequestParam String askQuestion, @RequestParam int accessCode, @RequestParam int crsId) {
		Courses course = courseRepository.findByCrsId(crsId);
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String name = auth.getName();
		User userName = userRepo.findByEMAILIgnoreCase(name);
		
		Question question = new Question(course, userName);
		question.setQUESTION(askQuestion);
		questionRepository.save(question);
		System.out.println(accessCode);
		return "redirect:/studentMessageBoard/courses/"+accessCode;
		
	}
	
	@RequestMapping(value="/joinCourse", method=RequestMethod.POST)
	public String joinClass(@RequestParam int accessCode) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String name = auth.getName();
		User userName = userRepo.findByEMAILIgnoreCase(name);
		Courses course = coursesService.getCourseByAccessCode(accessCode);
		List<User> newUser = (List<User>) userRepo.findAll();
		
		course.setUser(newUser);
		coursesService.saveCourse(course);
		
		return "redirect:/studentDash";
		
	}
	
	@RequestMapping(value= "/studentMessageBoard/courses/{accessCode}")
	public ModelAndView studentCourse(@PathVariable String accessCode) {
		int newAccessCode = Integer.parseInt(accessCode);
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String name = auth.getName();
		User userName = userRepo.findByEMAILIgnoreCase(name);
		Courses course = coursesService.getCourseByAccessCode(newAccessCode);
		List<Question> question = (List<Question>) questionRepository.findAll();
		List<Question> userQuestions = (List<Question>) questionRepository.findByUser_ID(userName.getID());
		ModelAndView mv = new ModelAndView("studentMessageBoard");
		mv.addObject("userQuestion", userQuestions);
		mv.addObject("question", question);
		mv.addObject("course", course);
		
		return mv;
		
		}
	
}
