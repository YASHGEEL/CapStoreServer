package com.capgemini.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.capgemini.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	@Query(value = "select p from Product p where p.startTime Between (:date) And (:date1)")
	public List<Product> newProducts(@Param("date") Date date,@Param("date1") Date date1);

}
