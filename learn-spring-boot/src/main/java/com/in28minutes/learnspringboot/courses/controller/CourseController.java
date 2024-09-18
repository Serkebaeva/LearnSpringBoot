package com.in28minutes.learnspringboot.courses.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.learnspringboot.courses.bean.Course;

@RestController
public class CourseController {
	// http://localhost:8080/courses

	@GetMapping("/courses")
    public List<Course> getAllCourses() {
      return Arrays.asList(new Course(1, "Learn Microservices", "in28minutes"), 
    		  new Course(2, "Learn Full Stack with Angular and React", "in 28minutes"));            
  }
	
	// http://localhost:8080/courses/1
	@GetMapping("/courses/1")
    public Course getCourseDetails() {
      return new Course(1, "Learn Java", "in28minutes");            
  }
	
	// http://localhost:8080/courses/2
	@GetMapping("/courses/2")
    public Course getCourseInfo() {
      return new Course(2, "Learn Python", "in28minutes");            
  }
	
}
