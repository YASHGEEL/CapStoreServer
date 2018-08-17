package com.capgemini.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capgemini.model.Customer;




@Repository
public interface ForgetPasswordCustomerRepository extends CrudRepository<Customer, Integer>{

	
	@Query(value="SELECT c from Customer c where c.email=(:email)")
	public Customer findCustomer(@Param(value="email") String email);
	
	
	@Query("Select c.securityAnswer from Customer c where c.email=:email")
	public String checkSecurityAnswer(@Param("email") String email);
	
}
