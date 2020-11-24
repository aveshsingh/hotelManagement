package com.hotelManagement.model;


public class SignUpRequestwithHotel {
     

 	private String customerPassword;
	private String role; 
	private String email;
	private String customerName;
	private int contact;
	private String hotelName;
	private String ownerName;
	private String hotelLocation;
	

	
	
	
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	
	
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getHotelLocation() {
		return hotelLocation;
	}
	public void setHotelLocation(String hotelLocation) {
		this.hotelLocation = hotelLocation;
	}
	
	@Override
	public String toString() {
		return "SignUpRequest [customerPassword=" + customerPassword + ", role=" + role + ", email=" + email
				+ ", customerName=" + customerName + ", contact=" + contact + "]";
	}
	
}
