package com.cout.incognito.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cout.incognito.models.Teacher;

@Repository("teacherRepo")
public interface teacherRepo extends CrudRepository<Teacher, String> {
	Teacher findByEMAILIgnoreCase(String EMAIL);

}
