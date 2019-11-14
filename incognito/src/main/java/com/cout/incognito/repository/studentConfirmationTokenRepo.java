package com.cout.incognito.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cout.incognito.models.studentConfirmationToken;

@Repository("studentConfirmationTokenRepo")
public interface studentConfirmationTokenRepo extends CrudRepository<studentConfirmationToken, String> {
    studentConfirmationToken findByConfirmationToken(String confirmationToken);
}
