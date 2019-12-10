package com.cout.incognito.services;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cout.incognito.models.Question;
import com.cout.incognito.repository.QuestionRepository;

@Service
public class QuestionService implements IQuestionService{

	@Autowired
	private QuestionRepository questionRepository;
	
	@Override
	public Question getQuestionsById(int id) {
		return questionRepository.findById(id);
	}

	@Override
	public void updateQuestion(Question question) {
		questionRepository.save(question);
		
	}

	@Override
	public void addQuestion(int id, String QUESTION) {
		questionRepository.save(new Question());
	}

	@Override
	public void deleteQuestion(int id) {
		Question question = questionRepository.findById(id);
		if(question != null){
			questionRepository.deleteById(id);
		}
		
	}

	@Override
	public void saveQuestion(Question question) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nudgeQuestion(Question question)
	{
	Date date = new Date();
	question.setCreatedDate(date);
	questionRepository.save(question);
	}

	public void AutoDeletion(List<Question> question)
	{
	Iterator<Question>Questioniterator = question.iterator();
	while (Questioniterator.hasNext())
	{
	Question question1 = Questioniterator.next();
	int date = (int) question1.getCreatedDate().getTime();
	int today = (int) new Date().getTime();
	int diffence = today - date;
	if (diffence > 30)
	{
		question1.setCourse(null);
		question1.setUser(null);
		questionRepository.deleteById(question1.getId());
	}
		}
	}

	}


