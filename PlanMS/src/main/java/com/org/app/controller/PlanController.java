package com.org.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.org.app.dto.PlanDTO;
import com.org.app.service.PlanService;

@RestController
public class PlanController {

	@Autowired
	PlanService serv;
	
	@RequestMapping(value="/getplans", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<PlanDTO> getPlans() {
		return serv.getPlans();
	}
	
	@RequestMapping(value="/checkplan/{planId}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Boolean checkPlan(@PathVariable Long planId) {
		return serv.checkPlan(planId);
	}

}
