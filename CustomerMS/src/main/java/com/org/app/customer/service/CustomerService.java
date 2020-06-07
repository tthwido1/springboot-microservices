package com.org.app.customer.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.org.app.customer.dto.CustomerDTO;
import com.org.app.customer.dto.FriendDTO;
import com.org.app.customer.entity.Customer;
import com.org.app.customer.repository.CustomerRepository;

@Service	//@Service doesnot work if name of class is Service, use @org.springframework.stereotype.Service
public class CustomerService {
	
	@Value("${friend.uri}")
	String friendUri;

	@Value("${plan.uri}")
	String planUri;
	
	@Autowired
	CustomerRepository repo;
	
	public String addCustomer(CustomerDTO custdto) {
		
		//check if planId is present in Plan table, if not present donot add customer
		Boolean isPlanIdValid = new RestTemplate().getForObject(planUri+"/checkplan/"+custdto.getPlanId(),Boolean.class);
		if(isPlanIdValid==false)
			return "Invalid Plan id";
		  		
		Customer cust = custdto.getCustomerEntity();
		repo.save(cust);
		
		List<FriendDTO> friendDTOs = new ArrayList<>();
		for(FriendDTO friendDTO: custdto.getFriends()) {
			friendDTOs.add(friendDTO);
		}
		
		String result = new RestTemplate().postForObject(friendUri+"/addfriends/"+custdto.getPhoneNumber(),friendDTOs,String.class);
		System.out.println(result);
		
		return "customer saved successfully";
	}

	public CustomerDTO getCustomer(Long phoneNumber) {
		CustomerDTO custdto;
		custdto = CustomerDTO.getCustomerDTO(repo.findByPhoneNumber(phoneNumber));
		
		@SuppressWarnings("unchecked")
		List<FriendDTO> friends = new RestTemplate().getForObject(friendUri+"/getfriends/"+phoneNumber, List.class);
		custdto.setFriends(friends);
		
		return custdto;
	}

}
