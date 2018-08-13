package com.capgemini.repository;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.model.Customer;
public interface UserRepository extends CrudRepository<Customer, Integer> {  
}  