package com.cout.incognito.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cout.incognito.models.Courses;
import com.cout.incognito.repository.CoursesRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;


@Service
@Transactional
public class CoursesService {
	
	@Autowired
	private final CoursesRepo courseRepository;
	
	public List<Courses> getAllCourses(){
		List<Courses> courses = new ArrayList();
		courseRepository.findAll().
		forEach(courses::add);
		
		return courses;
		
	}
	
	public Courses getCourseByAccessCode(int accessCode) {
		return courseRepository.findByAccessCode(accessCode);
		
	}
	public CoursesService(CoursesRepo courseRepository){
		this.courseRepository = courseRepository;
	}

	
	public void saveCourse(Courses course){
		courseRepository.save(course);
	}

}
