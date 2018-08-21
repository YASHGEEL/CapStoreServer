package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.model.Customer;
@Repository
public interface SignUpCustomerRepository extends JpaRepository<Customer, Integer> {

	@Query(value=" Select c From Customer c where c.email=?1")
	public Customer getCustomer(String email);
	
	@Query(value=" Select c From Customer c where c.phone=?1")
	public Customer getCustomerPhone(String phone);
	
	@Query(value=" Select c From Customer c where c.id=?1")
	public Customer findCustomerByid(int id);
}
