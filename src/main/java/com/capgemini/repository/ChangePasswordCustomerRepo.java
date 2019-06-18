package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capgemini.model.Customer;

@Repository
public interface ChangePasswordCustomerRepo extends JpaRepository<Customer, Integer>{

	@Query("Select c from Customer c where c.email = :email1")
	public Customer getCustomer(@Param("email1") String email1);	
	
	
}
