package com.org.app.customer.dto;

import java.util.ArrayList;
import java.util.List;

import com.org.app.customer.entity.Customer;

public class CustomerDTO {
	
	private Long phoneNumber;
	private String name;
	private String password;
	private Long planId;
	private List<FriendDTO> friends = new ArrayList<FriendDTO>();
	
	public CustomerDTO() {
	}
	
	public Customer getCustomerEntity() {
		Customer cust = new Customer();
		cust.setPhoneNumber(this.phoneNumber);
		cust.setName(this.name);
		cust.setPassword(this.password);
		cust.setPlanId(this.planId);
		return cust;
	}
	public static CustomerDTO getCustomerDTO(Customer cust) {
		CustomerDTO custdto = new CustomerDTO();
		custdto.setPhoneNumber(cust.getPhoneNumber());
		custdto.setName(cust.getName());
		custdto.setPassword(cust.getPassword());
		custdto.setPlanId(cust.getPlanId());
		//set friends value in service class
		return custdto;
	}
	
	@Override
	public String toString() {
		return "CustomerDTO [phoneNumber=" + phoneNumber + ", name=" + name + ", password=" + password + ", planId="
				+ planId + ", friends=" + friends.toString() + "]";
	}

	//GETTERS & SETTERS
	public List<FriendDTO> getFriends() {
		return friends;
	}
	
	public void setFriends(List<FriendDTO> friends) {
		this.friends = friends;
	}
	
	public Long getPlanId() {
		return planId;
	}
	
	public void setPlanId(Long planId) {
		this.planId = planId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
