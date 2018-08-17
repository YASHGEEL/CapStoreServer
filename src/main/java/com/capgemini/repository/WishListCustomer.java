package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.model.Customer;

public interface WishListCustomer extends JpaRepository<Customer, Integer>{

}   
