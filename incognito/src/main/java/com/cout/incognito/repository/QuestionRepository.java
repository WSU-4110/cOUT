package com.cout.incognito.repository;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cout.incognito.models.Courses;
import com.cout.incognito.models.Question;

@Repository("QuestionRepository")
@Transactional
public interface QuestionRepository extends CrudRepository<Question, Integer> {
	
    List<Question> findByUser_ID(int user);
	Question findById(int id);


}