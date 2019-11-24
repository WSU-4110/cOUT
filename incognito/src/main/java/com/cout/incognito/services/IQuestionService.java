package com.cout.incognito.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.cout.incognito.models.Question;



@Service
public interface IQuestionService {

	List<Question> getQuestionsById(int id);

	void updateQuestion( Question question);
	
	void addQuestion(int id, String QUESTION);
	
	void deleteQuestion(int id);
	
	void saveQuestion(Question question);

	
}
