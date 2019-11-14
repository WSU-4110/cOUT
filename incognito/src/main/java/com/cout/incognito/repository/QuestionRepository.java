package com.cout.incognito.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cout.incognito.models.Question;

@Repository("QuestionRepository")
public interface QuestionRepository extends CrudRepository<Question, Integer> {

    Question findByID(int iD);

}