package com.hotelManagement.controller;

import java.util.List;

import com.hotelManagement.model.Customer;
import com.hotelManagement.model.SignUpRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotelManagement.model.Hotel;
import com.hotelManagement.model.SignUp;
import com.hotelManagement.model.SignUpRequestwithHotel;
import com.hotelManagement.repos.CustomerRepository;
import com.hotelManagement.repos.HotelRepository;
import com.hotelManagement.repos.SignUpRepository;




@RestController
public class CustomerController {
	
	@Autowired
	SignUpRepository signUpRepository;
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	HotelRepository hotelRepository;



	@PostMapping(value = "/login")
	public SignUp getUser(@RequestBody SignUp signUp) {
		System.out.println(signUp.getEmail());
		System.out.println(signUp.getCustomerPassword());
		SignUp signUp2= signUpRepository.findByEmailAndCustomerPassword(signUp.getEmail(),signUp.getCustomerPassword());
		System.out.println(signUp2);
		if(signUp2!=null) {
			return signUp2;
		}
		return new SignUp();
		
	}
	
	
	
	@PostMapping(value="/saveDetails")
	public Boolean saveUser(@RequestBody SignUpRequest signUpRequest) {
		
		SignUp signUp = new SignUp();
		
		signUp.setCustomerPassword(signUpRequest.getCustomerPassword());
		signUp.setRole(signUpRequest.getRole());
		signUp.setEmail(signUpRequest.getEmail());
		signUp =signUpRepository.save(signUp);
		Customer customer = new Customer();
		customer.setContact(signUpRequest.getContact());
		customer.setCustomerName(signUpRequest.getCustomerName());
		customer.setCustomerId(signUp.getCustomerId());
		customerRepository.save(customer);
		return true;
	}
	
	@PostMapping(value="/saveCustomerDetailsWithHotel")
	public Boolean saveUserHotel(@RequestBody SignUpRequestwithHotel signUpRequest) {
		SignUp signUp = new SignUp();
		signUp.setCustomerPassword(signUpRequest.getCustomerPassword());
		signUp.setRole(signUpRequest.getRole());
		signUp.setEmail(signUpRequest.getEmail());
		signUp =signUpRepository.save(signUp);
		Customer customer = new Customer();
		customer.setContact(signUpRequest.getContact());
		customer.setCustomerName(signUpRequest.getCustomerName());
		customer.setCustomerId(signUp.getCustomerId());
		 customer = customerRepository.save(customer);
		Hotel hotel = new Hotel();
		hotel.setCustomer(customer);
		hotel.setContact(signUpRequest.getContact());
	
		hotel.setHotelLocation(signUpRequest.getHotelLocation());
		hotel.setHotelName(signUpRequest.getHotelName());
		hotel.setOwnerName(signUpRequest.getOwnerName());
		hotelRepository.save(hotel);
		return true;
	}
	
	
	
	@GetMapping(value="/get")
	public List<SignUp> getUser() {
		return signUpRepository.findAll();
		
	}
	
	@GetMapping(value="/get-customer")
	public Customer getCustomer(@RequestBody Integer customerId) {
		return customerRepository.findById(customerId).get();
		
	}
	
	
	
	

}
