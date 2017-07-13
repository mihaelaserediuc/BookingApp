package com.assist.bookingjava.controllers;

import com.assist.bookingjava.models.Course;
import com.assist.bookingjava.models.Topic;
import com.assist.bookingjava.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by frunza on 07.07.2017.
 */

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("topic/{id}/course")
    public List<Course> getAllCourses(@PathVariable String id) {
        return courseService.getAllCourse(id);
    }

    @RequestMapping("/topic/{topicId}/course/{id}")
    public Course getCourse(@PathVariable String id) {
        return courseService.getCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topic/{topicId}/course")
    public void addCourse(@RequestParam Course course, @PathVariable String topicId) {
        course.setTopic(new Topic(topicId, "", ""));
        courseService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topic/{topicId}/course/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable String topicId, @PathVariable String id) {
        course.setTopic(new Topic(topicId, "", ""));
        courseService.updateCourse(course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topic/{topicId}/course/{id}")
    public void deleteTopic(@PathVariable String id) {
        courseService.deleteCourse(id);
    }
}
