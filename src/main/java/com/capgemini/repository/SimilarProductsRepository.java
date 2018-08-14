package com.capgemini.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.capgemini.model.Customer;
import com.capgemini.model.Product;


public interface SimilarProductsRepository extends CrudRepository<Customer, Integer> {

	
}
