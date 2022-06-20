package com.test.courseapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.test.courseapi.bean.*;

public interface CourseRepo  extends CrudRepository<Course, String>{

}
