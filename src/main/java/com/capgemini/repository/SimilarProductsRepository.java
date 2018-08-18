package com.capgemini.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capgemini.model.Category;
import com.capgemini.model.Customer;
import com.capgemini.model.Product;

@Repository
public interface SimilarProductsRepository extends JpaRepository<Product, Integer> {

	@Query(value = "select product from Product product where category_id=?1")
	public ArrayList<Product> findSimilarProductsByProductRef(int id);

}