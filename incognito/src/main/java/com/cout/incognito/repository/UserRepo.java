package com.cout.incognito.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cout.incognito.models.User;

@Repository("UserRepo")
public interface UserRepo extends CrudRepository<User, String> {
	User findByEMAILIgnoreCase(String EMAIL);

}
