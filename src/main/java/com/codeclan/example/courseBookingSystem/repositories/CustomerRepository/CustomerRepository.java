package com.codeclan.example.courseBookingSystem.repositories.CustomerRepository;

import com.codeclan.example.courseBookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CustomerRepository extends JpaRepository<Customer, Long> {



}
