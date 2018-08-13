package com.capgemini.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.model.Customer;

@Repository
public interface SearchCustomerRepository extends CrudRepository<Customer, Integer> {

}
