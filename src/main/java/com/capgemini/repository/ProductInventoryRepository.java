package com.capgemini.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capgemini.model.Product;
import com.capgemini.model.ProductSummary;

public interface ProductInventoryRepository extends JpaRepository<Product, Integer> {
	@Query("select product from Product product")
	List<ProductSummary> displayListOfProducts();

	@Query("select product from Product product where product.status='Not Approved'")
	List<Product> displayListOfNotApprovedProducts();

}
