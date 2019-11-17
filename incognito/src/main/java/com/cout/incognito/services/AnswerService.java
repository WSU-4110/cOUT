package com.cout.incognito.services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.cout.incognito.models.Answer;
import com.cout.incognito.models.Student;
import com.cout.incognito.repository.AnswerRepository;
import com.cout.incognito.repository.studentRepo;

import javax.transaction.Transactional;


@Service
@Transactional
public class AnswerService {
	
	private final AnswerRepository answerRepository;
	
	public AnswerService(AnswerRepository answerRepository){
		this.answerRepository = answerRepository;
	}
	
	
	public void saveAnswer(Answer answer){
		answerRepository.save(answer);
	}

}
