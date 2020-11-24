package com.hotelManagement.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotelManagement.model.SignUp;

public interface SignUpRepository extends JpaRepository<SignUp, Integer> {
	
	SignUp findByEmailAndCustomerPassword(String email, String customerPassword); 
	SignUp findByCustomerId(Integer customerId);

}
