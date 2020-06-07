package com.org.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.app.entity.Plan;

public interface PlanRepository extends JpaRepository<Plan, Long>{

	public Plan findByPlanId(Long planId);
	List<Plan> findAll();
	
}

