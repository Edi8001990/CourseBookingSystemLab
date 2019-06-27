package com.codeclan.example.courseBookingSystem.controllers;

import com.codeclan.example.courseBookingSystem.models.Course;
import com.codeclan.example.courseBookingSystem.repositories.CourseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/rating/{rating}")
    public List<Course> getCourseByRating(@PathVariable int rating){
        return courseRepository.getAllCoursesByRating(rating);
    }

}
