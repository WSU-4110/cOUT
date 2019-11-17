package com.cout.incognito.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cout.incognito.models.Question;
import com.cout.incognito.repository.QuestionRepository;

@Service
public class QuestionService implements IQuestionService{

	@Autowired
	private QuestionRepository questionRepository;
	
	@Override
	public List<Question> getQuestionsById(int id) {
		// TODO Auto-generated method stub
		return questionRepository.findById(id);
	}

	@Override
	public void updateQuestion(Question question) {
		questionRepository.save(question);
		
	}

	@Override
	public void addQuestion(int id, String QUESTION) {
		questionRepository.save(new Question(id, QUESTION, false));
	}

	@Override
	public void deleteQuestion(int id) {
		List<Question> question = questionRepository.findById(id);
		if(question != null){
			questionRepository.deleteById(id);
		}
		
	}

	@Override
	public void saveQuestion(Question question) {
		// TODO Auto-generated method stub
		
	}




	}

