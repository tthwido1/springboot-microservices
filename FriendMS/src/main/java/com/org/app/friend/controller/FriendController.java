package com.org.app.friend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.org.app.friend.dto.FriendDTO;
import com.org.app.friend.service.FriendService;


@RestController
public class FriendController {

	@Autowired
	FriendService serv;

	@RequestMapping(value="/getfriends/{phoneNumber}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<FriendDTO> getFriends(@PathVariable Long phoneNumber) {
		return serv.getFriends(phoneNumber);
	}
	
	@RequestMapping(value="/addfriends/{phoneNumber}", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public String addCustomer(@PathVariable Long phoneNumber, @RequestBody List<FriendDTO> friendDTOs) {
		return serv.addFriends(phoneNumber, friendDTOs);
	}

}
