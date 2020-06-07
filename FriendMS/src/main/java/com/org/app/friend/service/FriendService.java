package com.org.app.friend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.org.app.friend.dto.FriendDTO;
import com.org.app.friend.entity.Friend;
import com.org.app.friend.repository.FriendRepository;

@org.springframework.stereotype.Service	//@Service doesnt work since name of class is Service
public class FriendService {

	@Autowired
	FriendRepository repo;

	public List<FriendDTO> getFriends(Long phoneNumber) {
		List<Friend> friends = repo.findByPhoneNumber(phoneNumber);
		
		List<FriendDTO> frienddto = new ArrayList<FriendDTO>();
		for(Friend friend: friends)  
			frienddto.add(FriendDTO.getFriendDTOObject(friend));
		return frienddto;
	}

	public String addFriends(Long phoneNumber, List<FriendDTO> friendDTOs) {	
		for(FriendDTO friendDTO: friendDTOs) {
			Friend friend = friendDTO.getFriendEntity(phoneNumber);
			repo.save(friend);
		}
		return "Friends added successfully";
	}
	
}
