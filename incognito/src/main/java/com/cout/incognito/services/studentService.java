package com.cout.incognito.services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.cout.incognito.models.Student;
import com.cout.incognito.repository.studentRepo;

import javax.transaction.Transactional;


@Service
@Transactional
public class studentService {
	
	private final studentRepo studentRepository;
	
	public studentService(studentRepo studentRepository){
		this.studentRepository = studentRepository;
	}
	
	
	public void saveStudent(Student student){
		studentRepository.save(student);
	}

}
