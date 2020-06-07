package com.org.app.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.org.app.customer.dto.CustomerDTO;
import com.org.app.customer.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService serv;

	@RequestMapping(value="/addcustomer", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public String addCustomer(@RequestBody CustomerDTO custdto) {
		return serv.addCustomer(custdto);
	}
	
	@RequestMapping(value="/getcustomer/{phoneNumber}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public CustomerDTO getCustomer(@PathVariable Long phoneNumber) {
		CustomerDTO custdto = serv.getCustomer(phoneNumber);
		return custdto;
	}

}
