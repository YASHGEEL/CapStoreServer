package com.capgemini.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.capgemini.model.Customer;
import com.capgemini.model.Product;

public interface ISearchRepo extends JpaRepository<Customer, Integer> {

	@Query(value = "select c from Customer c where c.name=(:sname)")
	public Customer findCustomer(@Param("sname") String sname);

}
