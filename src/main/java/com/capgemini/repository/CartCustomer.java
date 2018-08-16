package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.capgemini.model.Customer;
public interface CartCustomer extends JpaRepository<Customer, Integer> {  
}  