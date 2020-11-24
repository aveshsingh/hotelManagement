package com.hotelManagement.controller;

import java.util.List;

import com.hotelManagement.repos.BookingRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotelManagement.model.BookingDetails;

@RestController
public class BookingController {


	@Autowired
    BookingRepository bookingRepository;
	
	@PostMapping(value = "/save-booking")
	public BookingDetails saveBooking(@RequestBody BookingDetails bookingDetails) {

		return bookingRepository.save(bookingDetails);
	}
	
	
	@GetMapping(value = "/get-all-booking")
	public List<BookingDetails> getAllBooking() {
		return bookingRepository.findAll();
	}
	
	@GetMapping(value = "/get-booking")
	public BookingDetails getAllBooking(@RequestBody Integer bookingId) {
		return bookingRepository.findById(bookingId).get();
	}
	
	@GetMapping(value = "/get-all-booking-for-hotel/{hotelId}")
	public List<BookingDetails> getAllBookingForHotel(@PathVariable Integer hotelId) {
		return bookingRepository.findByHotel_HotelId(hotelId);
	}
}
