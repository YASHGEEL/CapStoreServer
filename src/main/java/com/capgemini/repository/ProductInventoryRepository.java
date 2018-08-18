package com.capgemini.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capgemini.model.Product;

public interface ProductInventoryRepository extends JpaRepository<Product, Integer>{
	@Query("select product from Product product where category_id=?1")
	List<Product> displayListOfProducts(int categoryId);

}
