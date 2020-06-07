package com.org.app.dto;

import com.org.app.entity.Plan;

public class PlanDTO {
	
	private Long planId;
	private Long rate;
	
	public PlanDTO() {	
	}
	
	public static PlanDTO getPlanDTOObject(Plan plan) {
		PlanDTO plandto = new PlanDTO();
		plandto.setPlanId(plan.getPlanId());
		plandto.setRate(plan.getRate());
		return plandto;
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
