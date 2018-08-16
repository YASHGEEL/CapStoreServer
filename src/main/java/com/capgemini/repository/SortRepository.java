package com.capgemini.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.capgemini.model.Product;

public interface SortRepository extends JpaRepository<Product, Integer>{


	
	@Query(value="SELECT p from Product p where p.category.id=:id order by p.cost asc")
	List <Product> sortProductsByPriceAscending(@Param("id") int id);
	
	
	@Query(value="select p from Product p where p.category.id=:id order by p.cost desc")
	List<Product> sortProductsByPriceDescending(@Param("id") int id);
	
	
	@Query(value="select p from Product p where p.category.id=:id order by p.viewCount desc")
	List<Product> sortProductsByViewCount(@Param("id") int id);
	
	
	@Query(value="select p from Product p where p.category.id=:id order by p.averageRating desc")
	List<Product> sortProductsByRatings(@Param("id") int id);


	@Query(value="select p from Product p where p.category.id=?1 and p.cost between ?2 and ?3 order by p.cost asc")
	List<Product> filterProductsWithinPriceRange(int id, float minPrice, float maxPrice);
	
}
