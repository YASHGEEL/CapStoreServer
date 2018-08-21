package com.capgemini.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.capgemini.exception.CategoryNotFoundException;
import com.capgemini.exception.ProductNotFoundException;
import com.capgemini.model.IDisplayProductUtil;
import com.capgemini.model.Product;

public interface DisplayProductRepository extends JpaRepository<Product, Integer> {

	/*
	 * @Query(value = "SELECT p from Product p where p.category.id=?1")
	 * List<Product> displayProducts(int categoryId) throws
	 * ProductNotFoundException, CategoryNotFoundException;
	 */

	List<IDisplayProductUtil> findByCategoryIdOrderByCostAsc(int categoryId)
			throws ProductNotFoundException, CategoryNotFoundException;

	/*
	 * List<IDisplayProductUtil> findByCategoryIdOrderByCostDesc(int categoryId)
	 * throws ProductNotFoundException, CategoryNotFoundException;
	 * 
	 * List<IDisplayProductUtil> findByCategoryIdOrderByAverageRatingDesc(int
	 * categoryId) throws ProductNotFoundException, CategoryNotFoundException;
	 * 
	 * List<IDisplayProductUtil> findByCategoryIdOrderByViewCountDesc(int
	 * categoryId) throws ProductNotFoundException, CategoryNotFoundException;
	 */
}
