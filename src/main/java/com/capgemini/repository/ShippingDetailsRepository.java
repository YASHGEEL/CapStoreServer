package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.capgemini.model.Customer;

public interface ShippingDetailsRepository extends JpaRepository<Customer, Integer>{
	
}
