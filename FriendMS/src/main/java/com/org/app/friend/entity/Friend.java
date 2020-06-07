package com.org.app.friend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Friend {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long FriendId;
	
	@Column(name="phone_number")
	private Long phoneNumber;
	
	@Column(name="friend_number")
	private Long friendNumber;
	
	public Friend() {
	}

	@Override
	public String toString() {
		return "Friend [FriendId=" + FriendId + ", phoneNumber=" + phoneNumber + ", friendNumber=" + friendNumber + "]";
	}
	
	//GETTERS & SETTERS
	public Long getFriendId() {
		return FriendId;
	}

	public void setFriendId(Long friendId) {
		FriendId = friendId;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Long getFriendNumber() {
		return friendNumber;
	}

	public void setFriendNumber(Long friendNumber) {
		this.friendNumber = friendNumber;
	}
	
	
}
