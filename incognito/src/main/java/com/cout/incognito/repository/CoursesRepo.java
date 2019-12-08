package com.cout.incognito.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cout.incognito.models.Courses;

@Repository("CoursesRepo")
public interface CoursesRepo extends CrudRepository<Courses, Integer> {
    List<Courses> findByUser_ID(int user);
    Courses findByAccessCode(int accesscode);
	Courses findByCrsId(int crsId);
}
