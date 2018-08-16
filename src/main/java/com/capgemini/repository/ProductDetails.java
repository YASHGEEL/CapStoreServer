package com.capgemini.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.capgemini.model.Product;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public interface ProductDetails  extends JpaRepository<Product, Integer>{
	
	@Query(value="SELECT product FROM Product product where product.id=?1") 
    Product getProductDetails(int id);
}
