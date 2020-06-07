package com.org.app.customer.dto;

public class FriendDTO {
	
	private Long friendNumber;
	
	public FriendDTO() {	
	}

	@Override
	public String toString() {
		return "FriendDTO [friendNumber=" + friendNumber + "]";
	}

	public Long getFriendNumber() {
		return friendNumber;
	}
	public void setFriendNumber(Long friendNumber) {
		this.friendNumber = friendNumber;
	}
}
