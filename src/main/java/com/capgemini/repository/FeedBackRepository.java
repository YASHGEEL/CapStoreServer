package com.capgemini.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.capgemini.model.FeedBack;
import com.capgemini.model.Product;

public interface FeedBackRepository extends JpaRepository<FeedBack, Integer> {
	
	boolean save(Product product);
	
	
	@Query(value = "SELECT f FROM FeedBack f INNER JOIN Product ON Product.id=(:id)",nativeQuery=true)
	public FeedBack getFeedBack(@Param("id") int id);
	@Query(value = "SELECT f FROM FeedBack f INNERJOIN Product ON Product.id=(:id)",nativeQuery=true)
	public List<FeedBack> getFeedBackList(@Param(value="id") int id);
}
