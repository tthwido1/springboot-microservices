package com.org.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plan {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long planId;
	private Long rate;
	
	public Plan() {
	}
	
	@Override
	public String toString() {
		return "Plan [planId=" + planId + ", rate=" + rate + "]";
	}
	
	//GETTERS & SETTERS	
	public Long getPlanId() {
		return planId;
	}
	
	public void setPlanId(Long planId) {
		this.planId = planId;
	}
	
	public Long getRate() {
		return rate;
	}
	
	public void setRate(Long rate) {
		this.rate = rate;
	}

}
