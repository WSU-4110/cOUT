package com.cout.incognito.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cout.incognito.models.teacherConfirmationToken;

@Repository("teacherConfirmationTokenRepo")
public interface teacherConfirmationTokenRepo extends CrudRepository<teacherConfirmationToken, String> {
    teacherConfirmationToken findByConfirmationToken(String confirmationToken);
}
