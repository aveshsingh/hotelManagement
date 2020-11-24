package com.hotelManagement.repos;

import org.springframework.data.jpa.repository.JpaRepository;


import com.hotelManagement.model.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {
	
	Hotel findByCustomer_CustomerId(int customerId);

}
