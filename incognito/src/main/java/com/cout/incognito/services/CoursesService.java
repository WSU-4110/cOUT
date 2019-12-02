package com.cout.incognito.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cout.incognito.models.Courses;
import com.cout.incognito.repository.CoursesRepo;

import javax.transaction.Transactional;


@Service
@Transactional
public class CoursesService {
	
	@Autowired
	private final CoursesRepo courseRepository;
	
	public CoursesService(CoursesRepo courseRepository){
		this.courseRepository = courseRepository;
	}
	
	
	public void saveCourse(Courses course){
		courseRepository.save(course);
	}
}	