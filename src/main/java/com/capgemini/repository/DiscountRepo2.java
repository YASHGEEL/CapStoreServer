package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.capgemini.model.Discount;
import com.capgemini.model.Product;

public interface DiscountRepo2 extends JpaRepository<Product,Integer>{


}
