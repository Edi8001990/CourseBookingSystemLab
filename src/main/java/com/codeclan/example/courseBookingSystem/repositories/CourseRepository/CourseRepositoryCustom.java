package com.codeclan.example.courseBookingSystem.repositories.CourseRepository;

import com.codeclan.example.courseBookingSystem.models.Course;
import com.codeclan.example.courseBookingSystem.models.Customer;

import java.util.List;

public interface CourseRepositoryCustom {

    List<Course> getAllCustomersFromCourse(Long id);
}
