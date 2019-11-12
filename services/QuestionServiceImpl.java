package com.cout.incognito.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cout.incognito.models.Question;
import com.cout.incognito.repository.QuestionRepository;


@Service
@Transactional
public class QuestionServiceImpl {
	
	@Autowired
	private QuestionRepository questionRepository;

	public Question find(int iD) {
		return questionRepository.findByID(iD);
	}
}
