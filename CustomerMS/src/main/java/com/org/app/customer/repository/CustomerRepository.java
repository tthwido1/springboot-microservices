package com.org.app.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.app.customer.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

	public Customer findByPhoneNumber(Long phoneNumber);
}
