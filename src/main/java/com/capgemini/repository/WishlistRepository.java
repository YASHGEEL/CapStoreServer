package com.capgemini.repository;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.model.Customer;

public interface WishlistRepository extends CrudRepository<Customer, Integer> {

}
