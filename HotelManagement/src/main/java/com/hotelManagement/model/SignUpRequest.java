package com.hotelManagement.model;

public class SignUpRequest {
     

 	private String customerPassword;
	private String role; 
	private String email;
	private String customerName;
	private int contact;
	
	
	
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
	
	@Override
	public String toString() {
		return "SignUpRequest [customerPassword=" + customerPassword + ", role=" + role + ", email=" + email
				+ ", customerName=" + customerName + ", contact=" + contact + "]";
	}
	
}
