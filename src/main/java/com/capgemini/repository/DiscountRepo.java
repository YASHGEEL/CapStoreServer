package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.model.Discount;

public interface DiscountRepo  extends JpaRepository<Discount,Integer>{
	
	

}
