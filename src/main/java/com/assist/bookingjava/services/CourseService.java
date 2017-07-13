package com.assist.bookingjava.services;

import com.assist.bookingjava.database.CourseDao;
import com.assist.bookingjava.models.Course;
import com.assist.bookingjava.models.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by frunza on 07.07.2017.
 */
@Service
public class CourseService {

    @Autowired
    private CourseDao courseDao;

    public List<Course> getAllCourse(String topicId) {
        List<Course> courses = new ArrayList<>();
        courseDao.findByTopicId(topicId).forEach(courses :: add);

        return courses;
    }

    public Course getCourse(String id) {
        return courseDao.findOne(id);
    }

    public void addCourse(Course course) {
        courseDao.save(course);
    }

    public void updateCourse(Course course) {
        courseDao.save(course);
    }

    public void deleteCourse(String id) {
        courseDao.delete(id);
    }

}
