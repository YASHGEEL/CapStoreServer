package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.capgemini.model.Customer;

public interface ShippingDetailsRepository extends JpaRepository<Customer, Integer>{
	@Query(value ="select cus from Customer cus where cus.id=?1")
	public Customer getDetails(@Param(value = "customerid") int customerid);

	
}
