package com.org.app.customer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity //this is used to indicate that Customer represents table
public class Customer {
	
	@Id @Column(name="phone_number")
	private Long phoneNumber; //@Id indicated phoneNumber is primary key of Customer table
	private String name;
	private String password;
	@Column(name="plan_id")
	private Long planId;
	
	public Customer() {
	}
	
	@Override
	public String toString() {
		return "Customer [phoneNumber=" + phoneNumber + ", name=" + name + ", password=" + password + ", planId="
				+ planId + "]";
	}
	
	//GETTERS & SETTERS
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
