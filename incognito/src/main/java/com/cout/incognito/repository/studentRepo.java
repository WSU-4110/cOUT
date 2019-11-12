package com.cout.incognito.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cout.incognito.models.Student;

@Repository("studentRepo")
public interface studentRepo extends CrudRepository<Student, String> {
	Student findByEMAILIgnoreCase(String EMAIL);

}
