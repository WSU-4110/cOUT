package com.cout.incognito.repository;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cout.incognito.models.Answer;

@Repository("AnswerRepository")
@Transactional
public interface AnswerRepository extends CrudRepository<Answer, Integer> {
		List<Answer> findById(int id);
	
}
