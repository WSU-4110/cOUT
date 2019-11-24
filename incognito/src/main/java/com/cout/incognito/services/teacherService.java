package com.cout.incognito.services;

import org.springframework.stereotype.Service;
import com.cout.incognito.models.Teacher;
import com.cout.incognito.repository.teacherRepo;

import javax.transaction.Transactional;


@Service
@Transactional
public class teacherService {
	
	private final teacherRepo teacherRepository;
	
	public teacherService(teacherRepo teacherRepository){
		this.teacherRepository = teacherRepository;
	}
	
	
	public void saveTeacher(Teacher teacher){
		teacherRepository.save(teacher);
	}

}
