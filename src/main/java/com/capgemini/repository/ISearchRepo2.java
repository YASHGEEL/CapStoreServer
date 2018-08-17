package com.capgemini.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.capgemini.model.Customer;
import com.capgemini.model.Product;

public interface ISearchRepo2 extends JpaRepository<Product, Integer> {

	@Query(value = "select p from Product p where p.name = :searchString")
	public List<Product> findProductbyName(@Param("searchString") String searchString);

	@Query(value = "select p from Product p where p.brand= :searchString")
	public List<Product> findProductbyBrand(@Param("searchString") String searchString);

	@Query(value = "select p from Product p where p.category.id=(select category.id from Category category where category.name=?1)")
	public List<Product> findProductbyCategory(@Param("searchString") String searchString);

}
