package com.capgemini.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capgemini.model.OrderDetails;

@Repository
public interface ProductReportRepository extends JpaRepository<OrderDetails, Integer> {

	
	@Query(value="select o from OrderDetails o ")
	public List getOrderDetails();
	
}

