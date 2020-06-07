package com.org.app.friend.dto;

import com.org.app.friend.entity.Friend;

public class FriendDTO {
	
	private Long friendNumber;
	
	public FriendDTO() {		
	}
	
	public static FriendDTO getFriendDTOObject(Friend friend) {
		FriendDTO frienddto = new FriendDTO();
		frienddto.setFriendNumber(friend.getFriendNumber());
		return frienddto;
	}
	public Friend getFriendEntity(Long phoneNumber) {
		Friend friend = new Friend();
		friend.setFriendNumber(this.getFriendNumber());
		friend.setPhoneNumber(phoneNumber);
		return friend;
	}
	
	@Override
	public String toString() {
		return "FriendDTO [friendNumber=" + friendNumber + "]";
	}

	//GETTERS & SETTERS
	public Long getFriendNumber() {
		return friendNumber;
	}
	
	public void setFriendNumber(Long friendNumber) {
		this.friendNumber = friendNumber;
	}
}
