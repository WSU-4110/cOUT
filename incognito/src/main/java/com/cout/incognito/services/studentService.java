package com.cout.incognito.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.cout.incognito.models.Student;
import com.cout.incognito.repository.studentRepo;

import javax.transaction.Transactional;


@Service
@Transactional
public class studentService {
	
	@Autowired
	private PasswordEncoder bCryptPasswordEncoder;
	
	private final studentRepo studentRepository;
	
	public studentService(studentRepo studentRepository){
		this.studentRepository = studentRepository;
	}
	
	
	public void saveStudent(Student student){
		student.setPassword(bCryptPasswordEncoder.encode(student.getPassword()));
		studentRepository.save(student);
	}

}
