package com.hotelManagement.controller;

import java.util.List;

import com.hotelManagement.model.Hotel;
import com.hotelManagement.repos.HotelRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelController {

	
	@Autowired
    HotelRepository hotelRepository;
	
	
	@PostMapping(value = "/save-hotel")
	public Hotel saveHotelDetails(@RequestBody Hotel hotel) {
		 return hotelRepository.save(hotel);
	}
	
	@GetMapping(value = "/get-all-hotel")
	public List<Hotel>  getHotelDetails() {
		return hotelRepository.findAll();
	}
	
	@GetMapping(value = "/get-hotel")
	public Hotel  getHotelDetails(@RequestBody Integer hotelId) {
		return hotelRepository.findById(hotelId).get();
	}
	
	@GetMapping(value = "/get-hotel-customer/{customerId}")
	public Hotel  getHotelDetailsForCustomer(@PathVariable Integer customerId) {
		return hotelRepository.findByCustomer_CustomerId(customerId);
	}
}
