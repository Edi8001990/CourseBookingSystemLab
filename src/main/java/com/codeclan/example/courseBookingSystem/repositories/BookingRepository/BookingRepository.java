package com.codeclan.example.courseBookingSystem.repositories.BookingRepository;

import com.codeclan.example.courseBookingSystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {

    List<Booking> getAllBookingsByDate(String date);
}
