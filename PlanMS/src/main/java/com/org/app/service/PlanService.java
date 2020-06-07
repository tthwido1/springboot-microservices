package com.org.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.org.app.dto.PlanDTO;
import com.org.app.entity.Plan;
import com.org.app.repository.PlanRepository;

@org.springframework.stereotype.Service	//@Service doesnt work since name of class is Service
public class PlanService {
	
	@Autowired
	PlanRepository repo;

	public List<PlanDTO> getPlans() {
		List<Plan> plans;
		plans = repo.findAll();
		
		List<PlanDTO> plandtos = new ArrayList<>();
		for(Plan plan : plans)
			plandtos.add(PlanDTO.getPlanDTOObject(plan));
		
		return plandtos;
	}

	public Boolean checkPlan(Long planId) {
		Plan plan = repo.findByPlanId(planId);
		
		if(plan==null)
			return false;
		else 
			return true;		
	}
	
}
