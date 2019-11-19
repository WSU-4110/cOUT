package com.cout.incognito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cout.incognito.models.Question;


@SpringBootApplication
@ComponentScan
public class IncognitoApplication {
	
	@Autowired
	public static void main(String[] args) throws Exception {
		SpringApplication.run(IncognitoApplication.class, args);
	
	}
	
	public String answerQuestion(Question question)
	{

		question.setIs_answered(true);
		return "TeacherDash";
	}

	
}
