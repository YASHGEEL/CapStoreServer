package com.capgemini.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.capgemini.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	@Query(value = "select p from Product p join p.category c where (p.startTime Between (?1) And (?2)) And (c.name=?3)")
	public List<Product> newProducts(Date date,Date date1,String categoryName);

}
