package com.codeclan.example.courseBookingSystem.components;


import com.codeclan.example.courseBookingSystem.models.Booking;
import com.codeclan.example.courseBookingSystem.models.Course;
import com.codeclan.example.courseBookingSystem.models.Customer;
import com.codeclan.example.courseBookingSystem.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.courseBookingSystem.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.courseBookingSystem.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        Course course1 = new Course("Java", "Edinburgh", 3);
        courseRepository.save(course1);


        Course course2 = new Course("JavaScript", "Glasgow", 5);
        courseRepository.save(course2);

        Booking booking1 = new Booking("01-06-19", course1);
        bookingRepository.save(booking1);


        Booking booking2 = new Booking("07-04-19", course2);
        bookingRepository.save(booking2);


        Customer customer1 = new Customer("John Smith", "Edinburgh", 25, booking1);
        customerRepository.save(customer1);




    }
}
