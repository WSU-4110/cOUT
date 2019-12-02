package com.cout.incognito.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cout.incognito.models.Course;

@Repository("CourseRepo")
public interface CourseRepo extends CrudRepository<Course, String> {
	Course findByCseNameIgnoreCase(String CourseName);

}
