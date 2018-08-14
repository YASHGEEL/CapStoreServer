package com.capgemini.repository;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.model.Customer;

public interface CartRepository extends CrudRepository<Customer, Integer> {

}
