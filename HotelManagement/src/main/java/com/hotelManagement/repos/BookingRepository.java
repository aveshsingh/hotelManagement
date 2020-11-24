package com.hotelManagement.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotelManagement.model.BookingDetails;

public interface BookingRepository extends JpaRepository<BookingDetails, Integer> {

 
	List<BookingDetails> findByHotel_HotelId(int hotelId);
}
