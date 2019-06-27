package com.codeclan.example.courseBookingSystem;

import com.codeclan.example.courseBookingSystem.models.Booking;
import com.codeclan.example.courseBookingSystem.models.Course;
import com.codeclan.example.courseBookingSystem.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.courseBookingSystem.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.courseBookingSystem.repositories.CustomerRepository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseBookingSystemApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Test
	public void getAllCoursesByRating(){

		List<Course> found = courseRepository.getAllCoursesByRating(3);
		assertEquals(1, found.size());
		assertEquals("Java", found.get(0).getName());

	}

	@Test
	public void getAllBookingsByDate(){
		List<Booking> found = bookingRepository.getAllBookingsByDate("01-06-19");
		assertEquals(1, found.size());
		assertEquals("01-06-19", found.get(0).getDate());
	}

	@Test
	public void yo(){

	}

}
