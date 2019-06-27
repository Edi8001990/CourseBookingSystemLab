package com.codeclan.example.courseBookingSystem.repositories.CourseRepository;

import com.codeclan.example.courseBookingSystem.models.Course;
import com.codeclan.example.courseBookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {

    List<Course> getAllCoursesByRating(int rating);
    List<Course> getAllCustomersFromCourse(Long id);

}
