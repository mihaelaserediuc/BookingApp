package com.assist.bookingjava.database;

import com.assist.bookingjava.models.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseDao extends CrudRepository <Course, String>{

    List<Course> findByTopicId(String topicId);

}
