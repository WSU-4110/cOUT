package com.cout.incognito.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.cout.incognito.models.User;
import com.cout.incognito.repository.UserRepo;

import javax.transaction.Transactional;


@Service
@Transactional
public class UserService {
	
	@Autowired
	private PasswordEncoder bCryptPasswordEncoder;
	
	private final UserRepo userRepository;
	
	public UserService(UserRepo userRepository){
		this.userRepository = userRepository;
	}
	
	
	public void saveUser(User user){
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		userRepository.save(user);
	}

}
