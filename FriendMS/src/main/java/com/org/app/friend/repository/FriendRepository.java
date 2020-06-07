package com.org.app.friend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.app.friend.entity.Friend;

public interface FriendRepository extends JpaRepository<Friend, Long> {
	List<Friend> findByPhoneNumber(Long phoneNumber);
}
